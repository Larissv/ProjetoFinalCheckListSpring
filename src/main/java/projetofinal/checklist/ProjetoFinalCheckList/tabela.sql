start transaction;
create table checklist
(
    id                  bigserial primary key not null,
    saidaRetorno        text                  not null,
    data_hora_sistema   timestamp             not null,
    dataC               text                  not null,
    hora                text                  not null,
    placa               text                  not null,
    motorista           text                  not null,
    km                  bigint                not null
        constraint km_positivo check (km >= 0),
    tracao              text                  not null,
    calibragemPneu      text                  not null,
    estepe              text                  not null,
    freioDianteiro      text                  not null,
    freioTraseiro       text                  not null,
    balanceamento       text                  not null,
    limpezaRadiador     text                  not null,
    oleoMotor           text                  not null,
    filtroOleo          text                  not null,
    parachoqueDianteiro text                  not null,
    parachoqueTraseiro  text                  not null,
    placasCaminhao      text                  not null,
    cintoSeguranca      text                  not null,
    pedais              text                  not null,
    aberturaPortas      text                  not null
);

end
transaction;