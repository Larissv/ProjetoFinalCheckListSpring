start transaction;
create table checklist
(
    id                  bigserial primary key not null,
    saida_retorno        text                  not null,
    data               text                  not null,
    hora                text                  not null,
    placa               text                  not null,
    motorista           text                  not null,
    km                  bigint                not null
        constraint km_positivo check (km >= 0),
    tracao              text                  not null,
    calibragem_pneu      text                  not null,
    estepe              text                  not null,
    freio_dianteiro      text                  not null,
    freio_traseiro       text                  not null,
    balanceamento       text                  not null,
    limpeza_radiador     text                  not null,
    oleo_motor           text                  not null,
    filtro_oleo          text                  not null,
    parachoque_dianteiro text                  not null,
    parachoque_traseiro  text                  not null,
    placas_caminhao      text                  not null,
    cinto_seguranca      text                  not null,
    pedais              text                  not null,
    abertura_portas      text                  not null
);

end
transaction;


-- data_hora_sistema   timestamp             not null,