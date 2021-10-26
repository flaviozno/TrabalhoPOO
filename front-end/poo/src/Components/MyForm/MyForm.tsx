import React from 'react';
import { TextField, Button } from '@material-ui/core';
import { Formik, Form } from 'formik'

import api from '../../services/api'

import { Container } from './styles'

interface iValues {
    nome: string;
    sobrenome: string;
    cpf: string;
    destino: string;
    origem: string
    idade: number;
    bagagem: number;
    acompanhantes: number;
}

interface iForm {
    onSubmit: (values: iValues) => void;
}

export default function MyForm(props: iForm) {
    return (
        <Container>
            <Formik
                initialValues={{nome: "", sobrenome: "", cpf: "", destino: "",  origem: "", idade: "", bagagem: "", acompanhantes: "" }}
                onSubmit={values => {
                    api.post(`viajante`, values)
                    console.log(values);
                }}
            >
                {({ values, handleChange, handleBlur }) => (
                    <Form id="form">
                        <TextField
                            name="nome"
                            value={values.nome}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            placeholder="Nome"
                            id="textField"
                        />
                        <TextField
                            name="sobrenome"
                            value={values.sobrenome}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            placeholder="Sobrenome"
                            id="textField"
                        />
                        <TextField
                            name="cpf"
                            value={values.cpf}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            placeholder="CPF"
                            id="textField"
                        />
                        <TextField
                            name="idade"
                            value={values.idade}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            placeholder="Idade"
                            id="textField"
                        />
                        <TextField
                            name="origem"
                            value={values.origem}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            placeholder="Origem"
                            id="textField"
                        />
                        <TextField
                            name="destino"
                            value={values.destino}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            placeholder="Destino"
                            id="textField"
                        />
                        <TextField
                            name="bagagem"
                            value={values.bagagem}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            placeholder="Bagagem"
                            id="textField"
                        />
                        <TextField
                            name="acompanhantes"
                            value={values.acompanhantes}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            placeholder="Acompanhantes"
                            id="textField"
                        />
                        <Button id="btn" type="submit">Cadastrar</Button>
                    </Form>
                )}
            </Formik>
        </Container>
    )
}