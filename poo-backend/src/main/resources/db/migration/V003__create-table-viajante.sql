CREATE TABLE viajante(
    id bigserial NOT NULL,
    nome character varying(255) NOT NULL,
    sobrenome character varying(255) NOT NULL,
    cpf character varying(255) NOT NULL,
    destino character varying(255) NOT NULL,
    origem character varying(255) NOT NULL,
    idade integer NOT NULL,
    bagagem integer NOT NULL,
    acompanhantes integer NOT NULL,
    PRIMARY KEY (id)
);
