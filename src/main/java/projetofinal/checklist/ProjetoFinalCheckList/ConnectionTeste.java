package projetofinal.checklist.ProjetoFinalCheckList;

import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckListEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionTeste {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("CheckList-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        CheckListEntity checkList = entityManager.find(CheckListEntity.class, 1);
        System.out.println(checkList.getMotorista());

        entityManager.close();
        entityManagerFactory.close();

    }
}
