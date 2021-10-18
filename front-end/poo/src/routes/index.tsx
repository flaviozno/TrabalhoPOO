import React from 'react'
import { Switch, Route, BrowserRouter } from 'react-router-dom';

import Home from '../pages/Home/index'
import Cadastro from '../pages/Cadastros/index'

export default function Routes() {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/" exact component={Home} />
        <Route path="/cadastro" exact component={Cadastro} />
      </Switch>
    </BrowserRouter>
  );
}
