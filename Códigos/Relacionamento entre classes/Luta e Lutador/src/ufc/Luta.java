package ufc;

import java.util.Random;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //Métodos

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void lutar(){
        if (isAprovada()){
            System.out.printf("%nDesafiado:%n");
            getDesafiado().apresentar();
            System.out.printf("%nDesafiante: %n");
            getDesafiante().apresentar();
            //gerando resultado da luta
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // sorteia entre 0, 1 e 2
            switch (vencedor){
                case 0: 
                System.out.printf("%nEmpatou%n");
                    getDesafiado().empatarLuta();;
                    getDesafiante().empatarLuta();;
                    break;
                case 1:
                    System.out.printf("%nVenceu "+ getDesafiado().getNome());
                    getDesafiado().ganharLuta();
                    break;
                case 2:
                    System.out.printf("%nVenceu "+ getDesafiante().getNome());
                    getDesafiante().ganharLuta();
                    break;
            }
        }else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
}
