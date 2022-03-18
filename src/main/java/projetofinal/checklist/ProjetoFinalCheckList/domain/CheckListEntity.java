package projetofinal.checklist.ProjetoFinalCheckList.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "checklist", schema = "public")
public class CheckListEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "saidaRetorno")
    private  String saidaRetorno;
    @Column(name = "dataC")
    private  String dataC;
    @Column(name = "hora")
    private  String hora;
    @Column(name = "placa")
    private  String placa;
    @Column(name = "motorista")
    private  String motorista;
    @Column(name = "km")
    private  Integer km;
    @Column(name = "tracao")
    private  String tracao;
    @Column(name = "calibragemPneu")
    private  String calibragemPneu;
    @Column(name = "estepe")
    private  String estepe;
    @Column(name = "freioDianteiro")
    private  String freioDianteiro;
    @Column(name = "freioTraseiro")
    private  String freioTraseiro;
    @Column(name = "balanceamento")
    private  String balanceamento;
    @Column(name = "limpezaRadiador")
    private  String limpezaRadiador;
    @Column(name = "oleoMotor")
    private  String oleoMotor;
    @Column(name = "filtroOleo")
    private  String filtroOleo;
    @Column(name = "paraChoqueDianteiro")
    private  String paraChoqueDianteiro;
    @Column(name = "paraChoqueTraseiro")
    private  String paraChoqueTraseiro;
    @Column(name = "placasCaminhao")
    private  String placasCaminhao;
    @Column(name = "cintoSeguranca")
    private  String cintoSeguranca;
    @Column(name = "pedais")
    private  String pedais;
    @Column(name = "aberturaPortas")
    private  String aberturaPortas;

}
