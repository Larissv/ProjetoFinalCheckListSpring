package projetofinal.checklist.ProjetoFinalCheckList.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckListGetDto {

    @NotNull
    Integer id;
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
}
