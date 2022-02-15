package projetofinal.checklist.ProjetoFinalCheckList.connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

public class ConnectionFactory {
    public DataSource dataSource;

    public ConnectionFactory() throws ClassNotFoundException, SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
        comboPooledDataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        comboPooledDataSource.setUser("postgres");
        comboPooledDataSource.setPassword("123456");

        comboPooledDataSource.setMaxPoolSize(10);

        this.dataSource = comboPooledDataSource;
    }

    public Connection recuperarConexao() throws SQLException {
        return this.dataSource.getConnection();
    }
}
