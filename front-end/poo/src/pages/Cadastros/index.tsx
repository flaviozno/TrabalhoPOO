import React from 'react'

import { Container } from './styles'

import Form from '../../Components/MyForm/MyForm'

export default function Cadastro(){
    document.title = 'FACOM Trips | Cadastro';
    return (
        <Container>
          <h1>-Cadastro de viagem-</h1>
          <Form onSubmit={({nome, sobrenome, cpf, idade, bagagem, acompanhantes, origem, destino})=> {
          }}/>
        </Container>
    )
}
