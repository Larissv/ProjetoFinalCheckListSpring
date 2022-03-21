package projetofinal.checklist.ProjetoFinalCheckList.dto;

import lombok.Data;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;

@Data
public class CheckListDto {

    private String saida_retorno;
    private String data;
    private String hora;
    private String placa;
    private String motorista;
    private Integer km;
    private String tracao;
    private String calibragem_pneu;
    private String estepe;
    private String freio_dianteiro;
    private String freio_traseiro;
    private String balanceamento;
    private String limpeza_radiador;
    private String oleo_motor;
    private String filtro_oleo;
    private String parachoque_dianteiro;
    private String parachoque_traseiro;
    private String placas_caminhao;
    private String cinto_seguranca;
    private String pedais;
    private String abertura_portas;

    public CheckListEntity transformaParaObjeto() {
        return new CheckListEntity(saida_retorno,
                                   data, hora, placa, motorista, km, tracao,
                                   calibragem_pneu, estepe,
                                   freio_dianteiro, freio_traseiro,
                                   balanceamento, limpeza_radiador,
                                   oleo_motor, filtro_oleo,
                                   parachoque_dianteiro,
                                   parachoque_traseiro, placas_caminhao,
                                   cinto_seguranca, pedais, abertura_portas);
    }
}
