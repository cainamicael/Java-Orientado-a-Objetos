import classes.Aluno;
import classes.Bolsista;
public class App {
    public static void main(String[] args) throws Exception {

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubisleu");
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        System.out.printf("%n");
        b1.pagarMensalidade();

    }
}
