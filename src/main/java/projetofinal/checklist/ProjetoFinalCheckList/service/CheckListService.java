package projetofinal.checklist.ProjetoFinalCheckList.service;

import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckListEntity;

import java.util.List;
import java.util.Optional;

public interface CheckListService {

    CheckListEntity save(CheckListEntity checkList);

    void deleteById(Integer checklistId);

    Optional<CheckListEntity> findById(Integer id);

    List<CheckListEntity> findAll();



//    private final CheckListDao checkListDao = new CheckListDao();

//    public List<CheckList> listaTodosCheckLists() {
//        return CheckListDao.listaTodosCheckLists();
//    }
//
//    public CheckList getCheckListId(final int id) {
//        return CheckListDao.getCheckListId(id);
//    }
//
//    public CheckList cadastrarCheckList(final CheckList checkList) {
//        return CheckListDao.cadastrarCheckList(checkList);
//    }
//
//    public void removeCheckList(final int id) {
//        CheckListDao.removeCheckList(id);
//    }
}
