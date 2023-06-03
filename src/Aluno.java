import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Aluno {
    private Connection conn;
    private Integer id;
    private String nome;
    private String curso;

    public Aluno(Connection conn) {
        this.conn = conn;
    }

    public static void consultar(int id) {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void incluir(String nome, String curso) throws SQLException {
        String sql = "INSERT INTO ALUNO( nome, curso )" + "VALUES ( ?, ? )";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, nome);
        pstm.setString(2, curso);

        pstm.executeUpdate();

    }
}
