import styled from 'styled-components'

export const Container = styled.div`
    border-radius: 4px;
    margin-top: 10px;
    background-color: white;
    display: flex;
    flex-direction: column;
    gap: 10px;
    padding: 16px;
    table{
        width: 100%;
    }
    th, td {
    border-bottom: 1px solid rgba(82, 82, 82, .1);
    font-weight: 300;
    text-align: center;
    padding: 8px;
    font-size: 12px;
    text-transform: uppercase;
    }
    th{
        font-weight: 500;
        font-size: 16px;
        width: 50px;
    }
    td{
        padding: 20px;
        border: none;
    }
    tr{
        :hover {
            cursor: pointer;
        }
    }
    tbody > tr{
        #id{
            :hover{
                cursor: pointer;
                background-color:  rgba(82, 82, 82, .3);
            }
        }
    }
`

export const Title = styled.div`
    padding: 16px;
    text-transform: uppercase;
    width: 100%;
    color: rgba(255, 82, 82, 1);
    font-size: 20px;
    text-align: center;
    font-weight: bold;
`
