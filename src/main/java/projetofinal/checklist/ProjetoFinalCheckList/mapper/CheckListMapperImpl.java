package projetofinal.checklist.ProjetoFinalCheckList.mapper;

import org.springframework.stereotype.Component;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListRetornoDto;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListPostDto;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;

import java.util.ArrayList;
import java.util.List;

@Component
public class CheckListMapperImpl implements CheckListMapper {

    @Override
    public CheckListEntity checkListPostDto(CheckListPostDto checkListPostDto) {
        if (checkListPostDto == null ) {
            return null;
        }
        CheckListEntity checkList = new CheckListEntity();

        checkList.setSaida_retorno(checkListPostDto.getSaida_retorno());
        checkList.setData(checkListPostDto.getData());
        checkList.setHora(checkListPostDto.getHora());
        checkList.setPlaca(checkListPostDto.getPlaca());
        checkList.setMotorista(checkListPostDto.getMotorista());
        checkList.setKm(checkListPostDto.getKm());
        checkList.setTracao(checkListPostDto.getTracao());
        checkList.setCalibragem_pneu(checkListPostDto.getCalibragem_pneu());
        checkList.setEstepe(checkListPostDto.getEstepe());
        checkList.setFreio_dianteiro(checkListPostDto.getFreio_dianteiro());
        checkList.setFreio_traseiro(checkListPostDto.getFreio_traseiro());
        checkList.setBalanceamento(checkListPostDto.getBalanceamento());
        checkList.setLimpeza_radiador(checkListPostDto.getLimpeza_radiador());
        checkList.setOleo_motor(checkListPostDto.getOleo_motor());
        checkList.setFiltro_oleo(checkListPostDto.getFiltro_oleo());
        checkList.setParachoque_dianteiro(checkListPostDto.getParachoque_dianteiro());
        checkList.setParachoque_traseiro(checkListPostDto.getParachoque_traseiro());
        checkList.setPlacas_caminhao(checkListPostDto.getPlacas_caminhao());
        checkList.setCinto_seguranca(checkListPostDto.getCinto_seguranca());
        checkList.setPedais(checkListPostDto.getPedais());
        checkList.setAbertura_portas(checkListPostDto.getAbertura_portas());

        return checkList;
    }

    @Override
    public CheckListRetornoDto checkListRetornoDto(CheckListEntity checkListEntity) {
        if (checkListEntity == null) {
            return null;
        }
        CheckListRetornoDto checkListRetornoDto = new CheckListRetornoDto();

        checkListRetornoDto.setId(checkListEntity.getId());
        checkListRetornoDto.setSaida_retorno(checkListEntity.getSaida_retorno());
        checkListRetornoDto.setPlaca(checkListEntity.getPlaca());
        checkListRetornoDto.setMotorista(checkListEntity.getMotorista());
        checkListRetornoDto.setHora(checkListEntity.getHora());
        checkListRetornoDto.setData(checkListEntity.getData());
        checkListRetornoDto.setKm(checkListEntity.getKm());
        checkListRetornoDto.setTracao(checkListEntity.getTracao());
        checkListRetornoDto.setCalibragem_pneu(checkListEntity.getCalibragem_pneu());
        checkListRetornoDto.setEstepe(checkListEntity.getEstepe());
        checkListRetornoDto.setFreio_dianteiro(checkListEntity.getFreio_dianteiro());
        checkListRetornoDto.setFreio_traseiro(checkListEntity.getFreio_traseiro());
        checkListRetornoDto.setBalanceamento(checkListEntity.getBalanceamento());
        checkListRetornoDto.setLimpeza_radiador(checkListEntity.getLimpeza_radiador());
        checkListRetornoDto.setOleo_motor(checkListEntity.getOleo_motor());
        checkListRetornoDto.setFiltro_oleo(checkListEntity.getFiltro_oleo());
        checkListRetornoDto.setParachoque_dianteiro(checkListEntity.getParachoque_dianteiro());
        checkListRetornoDto.setParachoque_traseiro(checkListEntity.getParachoque_traseiro());
        checkListRetornoDto.setPlacas_caminhao(checkListEntity.getPlacas_caminhao());
        checkListRetornoDto.setCinto_seguranca(checkListEntity.getCinto_seguranca());
        checkListRetornoDto.setPedais(checkListEntity.getPedais());
        checkListRetornoDto.setAbertura_portas(checkListEntity.getAbertura_portas());

        return checkListRetornoDto;
    }

    @Override
    public List<CheckListRetornoDto> listAllDto(List<CheckListEntity> checkLists) {
        if (checkLists == null) {
            return null;
        }
        List<CheckListRetornoDto> list = new ArrayList<>(checkLists.size());
        for (CheckListEntity checkListEntity : checkLists) {
            list.add(checkListRetornoDto(checkListEntity));
        }
        return list;
    }
}
