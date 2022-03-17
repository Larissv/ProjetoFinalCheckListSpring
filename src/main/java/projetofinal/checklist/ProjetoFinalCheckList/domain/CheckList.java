package projetofinal.checklist.ProjetoFinalCheckList.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "checklist")
public class CheckList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "saidaRetorno")
    private final String saidaRetorno;
    @Column(name = "dataC")
    private final String dataC;
    @Column(name = "hora")
    private final String hora;
    @Column(name = "placa")
    private final String placa;
    @Column(name = "motorista")
    private final String motorista;
    @Column(name = "km")
    private final Integer km;
    @Column(name = "tracao")
    private final String tracao;
    @Column(name = "calibragemPneu")
    private final String calibragemPneu;
    @Column(name = "estepe")
    private final String estepe;
    @Column(name = "freioDianteiro")
    private final String freioDianteiro;
    @Column(name = "freioTraseiro")
    private final String freioTraseiro;
    @Column(name = "balanceamento")
    private final String balanceamento;
    @Column(name = "limpezaRadiador")
    private final String limpezaRadiador;
    @Column(name = "oleoMotor")
    private final String oleoMotor;
    @Column(name = "filtroOleo")
    private final String filtroOleo;
    @Column(name = "paraChoqueDianteiro")
    private final String paraChoqueDianteiro;
    @Column(name = "paraChoqueTraseiro")
    private final String paraChoqueTraseiro;
    @Column(name = "placasCaminhao")
    private final String placasCaminhao;
    @Column(name = "cintoSeguranca")
    private final String cintoSeguranca;
    @Column(name = "pedais")
    private final String pedais;
    @Column(name = "aberturaPortas")
    private final String aberturaPortas;

}
