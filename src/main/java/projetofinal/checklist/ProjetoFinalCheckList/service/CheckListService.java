package projetofinal.checklist.ProjetoFinalCheckList.service;

import org.springframework.stereotype.Service;
import projetofinal.checklist.ProjetoFinalCheckList.dao.CheckListDAO;
import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckList;

import java.util.List;

@Service
public class CheckListService {

    private CheckListDAO checkListDAO = new CheckListDAO();

    public List<CheckList> listaTodosCheckLists() {
        return checkListDAO.listaTodosCheckLists();
    }

    public CheckList getCheckListId(int id) {
        return checkListDAO.getCheckListId(id);
    }

    public CheckList cadastrarCheckList(CheckList checkList) {
        return checkListDAO.cadastrarCheckList(checkList);
    }

    public void removeCheckList(int id) {
        checkListDAO.removeCheckList(id);
    }
}
