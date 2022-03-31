package projetofinal.checklist.ProjetoFinalCheckList.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;

@Repository
public interface CheckListDao extends JpaRepository<CheckListEntity, Integer> {
}
