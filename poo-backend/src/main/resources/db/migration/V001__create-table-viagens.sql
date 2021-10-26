CREATE TABLE viagens(
    id bigint NOT NULL,
    origem character varying(255) NOT NULL,
    destino character varying(255) NOT NULL,
    tipo character varying(255) NOT NULL,
    saida timestamp without time zone NOT NULL,
    chegada timestamp without time zone NOT NULL,
    classe integer NOT NULL,
    passageiros integer NOT NULL,
    escalas integer NOT NULL,
    preco double precision NOT NULL,
    PRIMARY KEY (id)
);
