package projetofinal.checklist.ProjetoFinalCheckList.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "checklist", schema = "public")
public class CheckListEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "saida_retorno")
    private  String saida_retorno;
    @Column(name = "data")
    private  String data;
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
    private  String calibragem_pneu;
    @Column(name = "estepe")
    private  String estepe;
    @Column(name = "freio_dianteiro")
    private  String freio_dianteiro;
    @Column(name = "freio_traseiro")
    private  String freio_traseiro;
    @Column(name = "balanceamento")
    private  String balanceamento;
    @Column(name = "limpeza_radiador")
    private  String limpeza_radiador;
    @Column(name = "oleo_motor")
    private  String oleo_motor;
    @Column(name = "filtro_oleo")
    private  String filtro_oleo;
    @Column(name = "parachoque_dianteiro")
    private  String parachoque_dianteiro;
    @Column(name = "parachoque_traseiro")
    private  String parachoque_traseiro;
    @Column(name = "placas_caminhao")
    private  String placas_caminhao;
    @Column(name = "cinto_seguranca")
    private  String cinto_seguranca;
    @Column(name = "pedais")
    private  String pedais;
    @Column(name = "abertura_portas")
    private  String abertura_portas;

    public CheckListEntity(String saidaRetorno,
                           String dataC,
                           String hora,
                           String placa,
                           String motorista,
                           Integer km,
                           String tracao,
                           String calibragemPneu,
                           String estepe,
                           String freioDianteiro,
                           String freioTraseiro,
                           String balanceamento,
                           String limpezaRadiador,
                           String oleoMotor,
                           String filtroOleo,
                           String paraChoqueDianteiro,
                           String paraChoqueTraseiro,
                           String placasCaminhao,
                           String cintoSeguranca,
                           String pedais,
                           String aberturaPortas) {
        this.saida_retorno = saidaRetorno;
        this.data = dataC;
        this.hora = hora;
        this.placa = placa;
        this.motorista = motorista;
        this.km = km;
        this.tracao = tracao;
        this.calibragem_pneu = calibragemPneu;
        this.estepe = estepe;
        this.freio_dianteiro = freioDianteiro;
        this.freio_traseiro = freioTraseiro;
        this.balanceamento = balanceamento;
        this.limpeza_radiador = limpezaRadiador;
        this.oleo_motor = oleoMotor;
        this.filtro_oleo = filtroOleo;
        this.parachoque_dianteiro = paraChoqueDianteiro;
        this.parachoque_traseiro = paraChoqueTraseiro;
        this.placas_caminhao = placasCaminhao;
        this.cinto_seguranca = cintoSeguranca;
        this.pedais = pedais;
        this.abertura_portas = aberturaPortas;
    }
}
