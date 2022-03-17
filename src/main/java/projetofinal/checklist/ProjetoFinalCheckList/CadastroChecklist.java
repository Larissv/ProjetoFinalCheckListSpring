package projetofinal.checklist.ProjetoFinalCheckList;

import projetofinal.checklist.ProjetoFinalCheckList.domain.CheckList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroChecklist {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("CheckList-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        CheckList checkList = entityManager.find(CheckList.class, 1);
        System.out.println(checkList.getMotorista());

        entityManager.close();
        entityManagerFactory.close();

    }
}
