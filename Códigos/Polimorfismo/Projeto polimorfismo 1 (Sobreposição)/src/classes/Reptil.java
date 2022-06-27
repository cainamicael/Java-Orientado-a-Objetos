package classes;

public class Reptil extends Animal {

    private String corDaEscama;
    
    public String getCorDaEscama() {
        return corDaEscama;
    }
    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
       System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
       System.out.println("Som de Réptil");
    }
    
}
