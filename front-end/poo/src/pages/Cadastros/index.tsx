import React, { useEffect, useState }  from 'react'

import api from '../../services/api'

import { Container } from './styles'

import Form from '../../Components/MyForm'

export default function Cadastro(){
    document.title = 'FACOM Trips | Cadastro';
    
    return (
        <Container>
          <h1>-Cadastro de viagem-</h1>
          <Form onSubmit={({firstName, LastName, cpf, destino, origem, idade, bagagem, acompanhantes })=> {
          }} />
        </Container>
    )
}
