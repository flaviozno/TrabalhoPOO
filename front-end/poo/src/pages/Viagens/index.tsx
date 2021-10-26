import React, { useEffect, useState } from 'react'

import api from '../../services/api'
import swal from 'sweetalert';

import { Container, Title } from './styles'
import { useHistory } from 'react-router-dom';

interface IViagens {
    id: number;
    tipo: string;
    chegada: string;
    saida: string;
    destino: string;
    origem: string;
    escalas: number;
    passageiros: number;
    preco: number;
    classe: number;
}

export default function Viagens(props: IViagens) {

    const history = useHistory();

    const [viagens, setViagens] = useState<IViagens[]>([])

    useEffect(() => {
        async function loadViagens() {
            const response = await api.get("/viagens").catch((e) => goBack())
            if (response && response.data) {
                setViagens(response.data)
            }
        }
        loadViagens()
    },[])

    const goBack = () => {
        swal("Erro ao se conectar com o DB!", "Tente novamente mais tarde!", "error").then(() => {
            history.push("/");
            window.location.reload();
        })
    }

    return (
        <Container>
            <Title>Tabela de Viagens</Title>
            <table>
                <thead>
                    <tr>
                        <th>Origem</th>
                        <th>Destino</th>
                        <th>Data de Saída</th>
                        <th>Data de Chegada</th>
                        <th>Preço</th>
                        <th>Passageiros</th>
                        <th>Classe</th>
                        <th>Escalas</th>
                        <th>Transporte</th>
                    </tr>
                </thead>
                <tbody>
                    {viagens.map((viagem) =>
                        <tr onClick={()=> history.push("/cadastro")}>
                            <td>{viagem.origem}</td>
                            <td>{viagem.destino}</td>
                            <td>{viagem.saida}</td>
                            <td>{viagem.chegada}</td>
                            <td>R$ {viagem.preco}</td>
                            <td>{viagem.passageiros}</td>
                            <td>{viagem.classe}</td>
                            <td>{viagem.escalas}</td>
                            <td>{viagem.tipo}</td>
                        </tr>
                    )}
                </tbody>
            </table>


        </Container >
    )
}
