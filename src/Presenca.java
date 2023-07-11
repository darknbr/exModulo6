package src;
import java.util.ArrayList;
import java.util.List;

class Presenca {
    private String dia;
    private List<Aluno> alunos;
    private List<Boolean> presencas;

    public Presenca(String dia, List<Aluno> alunos) {
        this.dia = dia;
        this.alunos = alunos;
        this.presencas = new ArrayList<>();
    }

    public String getDia() {
        return this.dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }

    public void addAlunos(Aluno aluno, boolean presente) {
        this.alunos.add(aluno);
        this.presencas.add(presente);
    }

    public boolean verificarPresenca(Aluno aluno) {
        int index = alunos.indexOf(aluno);
        if (index != -1) {
            return presencas.get(index);
        }
        return false;
    }
}