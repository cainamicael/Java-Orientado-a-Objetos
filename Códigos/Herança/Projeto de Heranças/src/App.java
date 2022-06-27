import classes.Aluno;
import classes.Funcionario;
import classes.Pessoa;
import classes.Professor;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("Masculino");
        p4.setSexo("Feminino");
        p2.setIdade(18);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

       // p1.receberAumento(550.20f);
       // p2.mudaTrabalho();
       // p4.cancelarMatricula();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
