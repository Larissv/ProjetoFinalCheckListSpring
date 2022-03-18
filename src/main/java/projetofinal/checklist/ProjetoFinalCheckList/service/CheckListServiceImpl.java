package projetofinal.checklist.ProjetoFinalCheckList.service;

import org.springframework.stereotype.Service;
import projetofinal.checklist.ProjetoFinalCheckList.dao.CheckListDao;
import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckListEntity;

import java.util.List;
import java.util.Optional;

@Service
public class CheckListServiceImpl implements CheckListService{

    CheckListDao checkListDao;

    public CheckListServiceImpl(CheckListDao checkListDao) {
        this.checkListDao = checkListDao;
    }

    @Override
    public CheckListEntity save(CheckListEntity checkList) {
        return this.checkListDao.save(checkList);
    }

    @Override
    public void deleteById(Integer checklistId) {
        checkListDao.deleteById(checklistId);

    }

    @Override
    public Optional<CheckListEntity> findById(Integer id) {
        return checkListDao.findById(id);
    }

    @Override
    public List<CheckListEntity> findAll() {
        return checkListDao.findAll();
    }
}
