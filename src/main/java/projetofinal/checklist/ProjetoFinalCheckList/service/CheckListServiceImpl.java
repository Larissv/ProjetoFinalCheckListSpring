package projetofinal.checklist.ProjetoFinalCheckList.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;
import projetofinal.checklist.ProjetoFinalCheckList.dao.CheckListDao;

import java.util.List;
import java.util.Optional;

@Service
public class CheckListServiceImpl implements CheckListService{

    CheckListDao checkListDao;

    @Autowired
    public CheckListServiceImpl(CheckListDao checkListDao) {
        this.checkListDao = checkListDao;
    }

    @Override
    public CheckListEntity save(CheckListEntity checkList) {
        return checkListDao.save(checkList);
    }

    @Override
    public void deleteById(Integer checklistId) {
        this.checkListDao.deleteById(checklistId);
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
