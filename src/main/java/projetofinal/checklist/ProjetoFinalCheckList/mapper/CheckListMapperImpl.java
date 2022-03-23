package projetofinal.checklist.ProjetoFinalCheckList.mapper;

import org.springframework.stereotype.Component;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListGetDto;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListPostDto;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;

import java.util.ArrayList;
import java.util.List;

@Component
public class CheckListMapperImpl implements CheckListMapper {

    @Override
    public CheckListEntity checkListPostDto(CheckListPostDto checkListPostDto) {
        if (checkListPostDto == null) {
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
    public CheckListGetDto checkListGetDto(CheckListEntity checkListEntity) {
        if (checkListEntity == null) {
            return null;
        }
        CheckListGetDto checkListGetDto = new CheckListGetDto();

        checkListGetDto.setId(checkListEntity.getId());
        checkListGetDto.setSaida_retorno(checkListEntity.getSaida_retorno());
        checkListGetDto.setPlaca(checkListEntity.getPlaca());
        checkListGetDto.setMotorista(checkListEntity.getMotorista());
        checkListGetDto.setHora(checkListEntity.getHora());
        checkListGetDto.setData(checkListEntity.getData());

        return checkListGetDto;
    }

    @Override
    public List<CheckListGetDto> listAllDto(List<CheckListEntity> checkLists) {
        if (checkLists == null) {
            return null;
        }
        List<CheckListGetDto> list = new ArrayList<>(checkLists.size());
        for (CheckListEntity checkListEntity : checkLists) {
            list.add(checkListGetDto(checkListEntity));
        }
        return list;
    }
}
