import React from 'react'

import { Link } from "react-router-dom";

import { Container, Aside } from './styles'

import HomeImg from '../../assets/image.jpg'

export default function Home() {
    document.title = 'FACOM Trips | Home';
    return (
        <Container>
            <Aside>
                <h1>FACOM Trips</h1>
                <span>Reserver aqui a viagem dos seus sonhos!</span>
                <button>
                    <Link to="/cadastro">
                       Let's travel
                    </Link>
                </button>
            </Aside>

            <img src={HomeImg} alt="logo" />
        </Container>
    )
}
