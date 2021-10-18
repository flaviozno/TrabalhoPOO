import React, { useEffect, useState }  from 'react'

import api from '../../services/api'

export default function Cadastro() {
    document.title = 'FACOM Trips | Cadastro';

    const [viajante, setViajante] = useState({})

    useEffect(() => {
        async function loadData() {
          const res = await api
            .get(`/viajante`)
            .catch((e) => alert("Houve um erro ao buscar os dados"));
    
          if (res && res.data) {
            setViajante(res.data);
          }
        }
        console.log(viajante);
        loadData();
      }, []);

console.log(viajante)
    return (
        <div>
            
        </div>
    )
}
