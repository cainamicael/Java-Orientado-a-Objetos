import classes.ControleRemoto;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.maisVolume();
        c.abrirMenu();
        c.ligarMudo();
        c.abrirMenu();
        c.play();
        c.abrirMenu();
        c.desligarMudo();
        c.abrirMenu();
        c.pause();
        c.abrirMenu();
        c.menosVolume();
        c.abrirMenu();
        c.fecharMenu();
        c.desligar();
        
    }
}
