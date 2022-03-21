package projetofinal.checklist.ProjetoFinalCheckList.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CheckListRespostaDto {

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

    public static CheckListRespostaDto transformaEmDto(CheckListEntity checkListEntity) {
        return new CheckListRespostaDto(checkListEntity.getSaida_retorno(),
                                        checkListEntity.getData(), checkListEntity.getHora(), checkListEntity.getPlaca(),
                                        checkListEntity.getMotorista(), checkListEntity.getKm(),
                                        checkListEntity.getTracao(), checkListEntity.getCalibragem_pneu(),
                                        checkListEntity.getEstepe(), checkListEntity.getFreio_dianteiro(),
                                        checkListEntity.getFreio_traseiro(), checkListEntity.getBalanceamento(),
                                        checkListEntity.getLimpeza_radiador(), checkListEntity.getOleo_motor(),
                                        checkListEntity.getFiltro_oleo(), checkListEntity.getParachoque_dianteiro(),
                                        checkListEntity.getParachoque_traseiro(), checkListEntity.getPlacas_caminhao(),
                                        checkListEntity.getCinto_seguranca(), checkListEntity.getPedais(),
                                        checkListEntity.getAbertura_portas());
    }
}
