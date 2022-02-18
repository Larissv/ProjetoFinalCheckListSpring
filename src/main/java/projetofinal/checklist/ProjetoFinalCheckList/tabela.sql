create table checklist(
                          id                  bigserial primary key not null,
                          saidaRetorno               text,
                          dataC               text,
                          hora                text,
                          placa               text,
                          motorista           text,
                          km                  text,
                          tracao              text,
                          calibragemPneu      text,
                          estepe              text,
                          freioDianteiro      text,
                          freioTraseiro       text,
                          balanceamento       text,
                          limpezaRadiador     text,
                          oleoMotor           text,
                          filtroOleo          text,
                          parachoqueDianteiro text,
                          parachoqueTraseiro  text,
                          placasCaminhao      text,
                          cintoSeguranca      text,
                          pedais              text,
                          aberturaPortas      text
);

select * from checklist;




drop table checklist;