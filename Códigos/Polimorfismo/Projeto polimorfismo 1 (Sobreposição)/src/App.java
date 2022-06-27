import classes.Mamifero;
import classes.Reptil;
import classes.Peixe;
import classes.Ave;
import classes.Canguru;
import classes.Cachorro;
import classes.Cobra;
import classes.Tartaruga;
import classes.GoldFish;
import classes.Arara;

public class App {
    public static void main(String[] args) throws Exception {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();

        
        m.setPeso(35.3f);
        m.setCorDoPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();
        r.locomover();

        c.locomover();
        ca.locomover();
        ca.emitirSom();
        c.emitirSom();

        t.locomover();
        c.locomover();

    }
}
