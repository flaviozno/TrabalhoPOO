import React, {useState} from 'react';
import { TextField, Button } from '@material-ui/core';
import { Formik, Form } from 'formik'

import api from '../../services/api'

import { Container } from './styles'

import { useHistory } from 'react-router-dom';
interface iValues {
    nome: string;
    sobrenome: string;
    cpf: string;
    idade: number;
    bagagem: number;
    acompanhantes: number;
    origem: string;
    destino: string;
}

interface iForm {
    onSubmit: (values: iValues) => void;
}

export default function MyForm(props: iForm) {
    const [flag, setFlag] = useState(1)
    const history = useHistory();
    return (
        <Container>
            <Formik
                initialValues={{nome: "", sobrenome: "", cpf: "", idade: "", bagagem: "", acompanhantes: "", origem: "", destino: ""}}
                onSubmit={values => {
                    try {
                        api.post(`viajante`, values).catch((e)=> {
                            if(e) alert(e.message)
                            else setFlag(0)
                        })
                    } catch (error) {
                        console.log(error)
                    }finally {
                        if(!flag)
                            window.location.reload();
                        else{
                            history.push("/");
                            window.location.reload();
                        }
                    }
                }}
            >
                {({ values, handleChange, handleBlur }) => (
                    <Form id="form">
                        <TextField
                            name="nome"
                            value={values.nome}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            required
                            placeholder="Nome"
                            id="textField"
                        />
                        <TextField
                            name="sobrenome"
                            value={values.sobrenome}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            required
                            placeholder="Sobrenome"
                            id="textField"
                        />
                        <TextField
                            name="cpf"
                            value={values.cpf}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            required
                            placeholder="CPF"
                            id="textField"
                        />
                        <TextField
                            name="idade"
                            value={values.idade}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            required
                            placeholder="Idade"
                            id="textField"
                        />
                        <TextField
                            name="bagagem"
                            value={values.bagagem}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            required
                            placeholder="Bagagem"
                            id="textField"
                        />
                        <TextField
                            name="acompanhantes"
                            value={values.acompanhantes}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            required
                            placeholder="Acompanhantes"
                            id="textField"
                        />
                        <TextField
                            name="origem"
                            value={values.origem}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            required
                            placeholder="Origem"
                            id="textField"
                        />
                        <TextField
                            name="destino"
                            value={values.destino}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            required
                            placeholder="Destino"
                            id="textField"
                        />
                        <Button id="btn" type="submit">Cadastrar</Button>
                    </Form>
                )}
            </Formik>
        </Container>
    )
}