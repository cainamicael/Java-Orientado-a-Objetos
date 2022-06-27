package classes;

public class Bolsista extends Aluno {
    private float bolsa;
    

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.printf("Renovando a bolsa de %s", this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }
    
}
