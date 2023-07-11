package src;
import java.util.List;

public class Presenca {
    private String dia;
    private List<Aluno> alunos;


    public Presenca(String dia, List<Aluno> alunos){
        this.dia = dia;
        this.alunos = alunos;    
    }
    
    public String getDia(){
        return dia;
    }

    public void setDia(String dia){
        this.dia = dia;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public void addAlunos(Aluno aluno){
        alunos.add(aluno);
    }

}