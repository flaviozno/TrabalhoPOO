## SETUP
# Download JBDC e POSTGRESQL
- Instale o __postgresql__ e o __pgAdmin4__.
- Baixe a versão compatível do [__JBDC__](https://jdbc.postgresql.org/download.html) para conseguir se conectar no __postgres__.
- Após fazer o __pull__ do repositório, adicione o path do __JBDC__ na pasta do projeto para conseguir rodar o codigo.

# Variáveis Locais
- Dentro do arquivo __conect.java__ altere o __password__ para o padrao do seu postgres e também o caminho do __URL__
- Caso tente inserir alguma coisa no BD, altere o local pois ele está consfigurado como __PK__.

## OBS:
Familia vou dar a visao pra vcs. Eu pensei no esquema na seguinte forma porma por agora. Nos criamos uma classe passageiro q vai ter todas as infos da pessoa euma tranporte no mesmo esquema. Ai dentro de um service.java, nos usamos um arrayLista de pessoas e transpote para combinarmos a infos.
Tipo criarmos varios destinos fixos em trasnporte e guardamos isso em arrays. Quando alguem informar um new passageiro nos so juntamos tudo e rearmazenamos isso no banco de dados.