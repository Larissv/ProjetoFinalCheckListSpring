package projetofinal.checklist.ProjetoFinalCheckList.service;

import org.springframework.stereotype.Service;
import projetofinal.checklist.ProjetoFinalCheckList.dao.CheckListDao;
import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckList;

import java.util.List;

@Service
public class CheckListService {
    private final CheckListDao checkListDao = new CheckListDao();

    public List<CheckList> listaTodosCheckLists() {
        return checkListDao.listaTodosCheckLists();
    }

    public CheckList getCheckListId(final int id) {
        return checkListDao.getCheckListId(id);
    }

    public CheckList cadastrarCheckList(final CheckList checkList) {
        return checkListDao.cadastrarCheckList(checkList);
    }

    public void removeCheckList(final int id) {
        checkListDao.removeCheckList(id);
    }
}
