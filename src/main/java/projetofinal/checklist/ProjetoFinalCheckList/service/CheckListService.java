package projetofinal.checklist.ProjetoFinalCheckList.service;

import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;

import java.util.List;
import java.util.Optional;

public interface CheckListService {

    CheckListEntity save(CheckListEntity checkList);

    Optional<CheckListEntity> findById(Integer id);

    List<CheckListEntity> findAll();

    void deleteById(Integer checklistId);
}
