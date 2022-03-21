package projetofinal.checklist.ProjetoFinalCheckList.entity;

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
    @Column(name = "saida_retorno")
    private  String saidaRetorno;
    @Column(name = "data")
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
    @Column(name = "calibragem_pneu")
    private  String calibragemPneu;
    @Column(name = "estepe")
    private  String estepe;
    @Column(name = "freio_dianteiro")
    private  String freioDianteiro;
    @Column(name = "freio_traseiro")
    private  String freioTraseiro;
    @Column(name = "balanceamento")
    private  String balanceamento;
    @Column(name = "limpeza_radiador")
    private  String limpezaRadiador;
    @Column(name = "oleo_motor")
    private  String oleoMotor;
    @Column(name = "filtro_oleo")
    private  String filtroOleo;
    @Column(name = "parachoque_dianteiro")
    private  String paraChoqueDianteiro;
    @Column(name = "parachoque_traseiro")
    private  String paraChoqueTraseiro;
    @Column(name = "placas_caminhao")
    private  String placasCaminhao;
    @Column(name = "cinto_seguranca")
    private  String cintoSeguranca;
    @Column(name = "pedais")
    private  String pedais;
    @Column(name = "abertura_portas")
    private  String aberturaPortas;

}
