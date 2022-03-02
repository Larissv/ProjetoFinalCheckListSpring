start transaction;
create table checklist
(
    id                  bigserial primary key not null,
    saidaretorno        text                  not null,
    data_hora_sistema   timestamp             not null,
    datac               text                  not null,
    hora                text                  not null,
    placa               text                  not null,
    motorista           text                  not null,
    km                  bigint                not null
        constraint km_positivo check (km >= 0),
    tracao              text                  not null,
    calibragempneu      text                  not null,
    estepe              text                  not null,
    freiodianteiro      text                  not null,
    freiotraseiro       text                  not null,
    balanceamento       text                  not null,
    limpezaradiador     text                  not null,
    oleomotor           text                  not null,
    filtrooleo          text                  not null,
    parachoquedianteiro text                  not null,
    parachoquetraseiro  text                  not null,
    placascaminhao      text                  not null,
    cintoseguranca      text                  not null,
    pedais              text                  not null,
    aberturaportas      text                  not null
);
end transaction;