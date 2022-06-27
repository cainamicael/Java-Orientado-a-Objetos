package classes;

public class Aluno extends Pessoa { //public final class Para não ter herdeiros

    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensalidade(){ //public final Para não poder ser sobreposto
        System.out.printf("Pagando mensalidade do aluno %s", this.getNome());
    } 
    
}
