package projetofinal.checklist.ProjetoFinalCheckList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetofinal.checklist.ProjetoFinalCheckList.entity.CheckListEntity;

@Repository
public interface CheckListRepository extends JpaRepository<CheckListEntity, Integer> {
}
