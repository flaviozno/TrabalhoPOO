import React  from 'react'

import { Container } from './styles'

import Form from '../../Components/MyForm/MyForm'

export default function Cadastro(){
    document.title = 'FACOM Trips | Cadastro';
    
    return (
        <Container>
          <h1>-Cadastro de viagem-</h1>
          <Form onSubmit={({firstName, lastName, cpf, destino, origem, idade, bagagem, acompanhantes })=> {
          }} />
        </Container>
    )
}
