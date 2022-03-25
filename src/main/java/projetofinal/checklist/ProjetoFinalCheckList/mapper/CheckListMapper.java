package projetofinal.checklist.ProjetoFinalCheckList.mapper;

import org.mapstruct.Mapper;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListRetornoDto;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListPostDto;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CheckListMapper {

    CheckListEntity checkListPostDto(CheckListPostDto checkListDto);

    CheckListRetornoDto checkListGetDto(CheckListEntity checkListEntity);

    List<CheckListRetornoDto> listAllDto(List<CheckListEntity> checkLists);
}
