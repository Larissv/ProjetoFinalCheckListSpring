package projetofinal.checklist.ProjetoFinalCheckList.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CheckList {
    private Integer id;
    private final String saidaRetorno;
    private final String dataC;
    private final String hora;
    private final String placa;
    private final String motorista;
    private final Integer km;
    private final String tracao;
    private final String calibragemPneu;
    private final String estepe;
    private final String freioDianteiro;
    private final String freioTraseiro;
    private final String balanceamento;
    private final String limpezaRadiador;
    private final String oleoMotor;
    private final String filtroOleo;
    private final String paraChoqueDianteiro;
    private final String paraChoqueTraseiro;
    private final String placasCaminhao;
    private final String cintoSeguranca;
    private final String pedais;
    private final String aberturaPortas;
}
