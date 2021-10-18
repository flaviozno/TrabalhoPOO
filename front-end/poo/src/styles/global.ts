import {createGlobalStyle} from 'styled-components'

export default createGlobalStyle`
    @import url('https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;800&display=swap');
   * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
   }
    a{
    text-decoration: none;
    }
    body{
        background-color: #fff;
        font: 14px 'Roboto', sans-serif;
    }
`