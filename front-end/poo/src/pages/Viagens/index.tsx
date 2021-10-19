import React, { useEffect, useState } from 'react'

import api from '../../services/api'

import { Container, Title } from './styles'

interface IViagens {
    id: number;
    tipoTransporte: string;
    dataChegada: string;
    dataSaida: string;
    destino: string;
    origem: string;
    escalas: number;
    passageiros: number;
    preco: number;
    tipoClasse: number;
}

export default function Viagens(props: IViagens) {

    const [viagens, setViagens] = useState<IViagens[]>([])

    useEffect(() => {
        async function loadViagens() {
            const response = await api
                .get("/viagens")
                .catch((e) => alert("Nenhuma viagem foi encontrada"))

            if (response && response.data) {
                setViagens(response.data)
            }
        }
        loadViagens()
    }, [])
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
                    {viagens.map((viagem)=>
                     <tr>
                        <td>{viagem.origem}</td>
                        <td>{viagem.destino}</td>
                        <td>{viagem.dataSaida}</td>
                        <td>{viagem.dataChegada}</td>
                        <td>R$ {viagem.preco}</td>
                        <td>{viagem.passageiros}</td>
                        <td>{viagem.tipoClasse}</td>
                        <td>{viagem.escalas}</td>
                        <td>{viagem.tipoTransporte}</td>
                     </tr>
                 )}
                </tbody>
            </table>
        </Container>
    )
}
