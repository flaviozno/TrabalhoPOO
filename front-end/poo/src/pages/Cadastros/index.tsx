import React, { useEffect, useState }  from 'react'

import api from '../../services/api'


export default function Cadastro(){
    document.title = 'FACOM Trips | Cadastro';

    const [viajante, setViajante] = useState({});

    useEffect(() => {
      async function loadApi(){
        const response = await api
        .get(`/viajante`)
        .catch((e)=> alert("Você eh burro!"));
        
        if(response && response.data){
          setViajante(response.data)
        }
      }
      loadApi()
      }, []);
      
      console.log(viajante)
    return (
        <div>
           
        </div>
    )
}
