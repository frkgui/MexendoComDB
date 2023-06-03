import java.sql.Connection;
import java.sql.SQLException;

public class AlunoApp {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database db = new Database();

        Connection conn = db.getConnection();

        Aluno aluno = new Aluno(conn);

        String alunos[][] = {
                {"Michael","Nutrição"},
                {"Diego Souza", "ADS"},
                {"Michelle Obama", "Fisioterapia"},
                {"Thiago Veigh", "Direito"}};

       for(String[] _aluno: alunos){
         aluno.incluir(_aluno[0], _aluno[1]);
    }

       Aluno.consultar(2);
        System.out.println(aluno.toString());
}}
