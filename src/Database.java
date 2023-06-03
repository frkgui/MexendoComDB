import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String JDBC_DRIVER = "org.sqlite.JBDC";
    private static final String DBURL = "jdbc:sqlite:alunos.db";
    private static Connection conn = null;

    public Database() throws SQLException {
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
    if(conn!=null){
        criarTabelas();
        return conn;
    }
    Class.forName(DBURL);

    conn = DriverManager.getConnection(DBURL);

    return conn;

    }

    private void criarTabelas() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS ALUNO("+ "id INTEGER PRIMARY KEY AUTOINCREMENT" + "nome TEXT NOT NULL, " + "curso TEXT NOT NULL)";

        Statement stm = conn.createStatement();
        stm.execute(sql);
    }




}
