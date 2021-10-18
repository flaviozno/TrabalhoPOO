import styled from 'styled-components'

export const Container = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    img{
        height: 100vh;
    }
`
export const Aside = styled.div`
    display: flex;
    flex-direction: column;
    h1{
        color: red;
        font-size: 30px;
        letter-spacing: 1.2px;
    }

    span{
        font-size: 20px;
        word-wrap: wrap;
        word-break: break-word;
        letter-spacing: 1.4px;
        max-width: 80%;
        text-align: justify;
        margin: 10px 0 10px 0;
    }
    button{
        width: 0 auto;
        height: 30px;
        align-self: center;
        cursor: pointer;
        font-size: 20px;
        border: none;
        border-radius: 10px;
        padding: 10px;
        display: flex;
        align-items: center;
    }
` 