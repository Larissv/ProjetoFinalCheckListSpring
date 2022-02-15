package projetofinal.checklist.ProjetoFinalCheckList.connection;

import java.sql.SQLException;

public class TestaConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConnectionFactory connectionFactory = new ConnectionFactory();

        for (int i = 0; i < 20; i++) {
            connectionFactory.recuperarConexao();
            System.out.println("Conexao: " + i);

        }

    }
}
