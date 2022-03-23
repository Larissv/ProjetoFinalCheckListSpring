package projetofinal.checklist.ProjetoFinalCheckList.dto;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class CheckListPostDto {

    @NotNull
    String saida_retorno;
    @NotNull
    String data;
    @NotNull
    String hora;
    @NotNull
    String placa;
    @NotNull
    String motorista;
    @NotNull
    Integer km;
    @NotNull
    String tracao;
    @NotNull
    String calibragem_pneu;
    @NotNull
    String estepe;
    @NotNull
    String freio_dianteiro;
    @NotNull
    String freio_traseiro;
    @NotNull
    String balanceamento;
    @NotNull
    String limpeza_radiador;
    @NotNull
    String oleo_motor;
    @NotNull
    String filtro_oleo;
    @NotNull
    String parachoque_dianteiro;
    @NotNull
    String parachoque_traseiro;
    @NotNull
    String placas_caminhao;
    @NotNull
    String cinto_seguranca;
    @NotNull
    String pedais;
    @NotNull
    String abertura_portas;
}
