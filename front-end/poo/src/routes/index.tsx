import React from 'react'
import { Switch, Route, BrowserRouter } from 'react-router-dom';

import Home from '../pages/Home/index'
import Cadastro from '../pages/Cadastros/index'
import Viagens from '../pages/Viagens/index'

export default function Routes() {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact component={Home}/>
        <Route path="/cadastro" exact component={Cadastro}/>
        <Route path="/viagens" exact component={Viagens} />
      </Switch>
    </BrowserRouter>
  );
}
