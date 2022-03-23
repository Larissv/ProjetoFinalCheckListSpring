package projetofinal.checklist.ProjetoFinalCheckList.mapper;

import org.mapstruct.Mapper;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListGetDto;
import projetofinal.checklist.ProjetoFinalCheckList.dto.CheckListPostDto;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CheckListMapper {

    CheckListEntity checkListPostDto(CheckListPostDto checkListDto);

    CheckListGetDto checkListGetDto(CheckListEntity checkListEntity);

    List<CheckListGetDto> listAllDto(List<CheckListEntity> checkLists);
}
