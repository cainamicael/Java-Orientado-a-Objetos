import samsung.Celular;
public class App {
    public static void main(String[] args) throws Exception {
        
        //fabricando um s22
        Celular s22 = new Celular();

        //tirando o s22 da caixa
        s22.status(); 
        s22.statusLogico();
        
        //procedimentos na ordem certa
        s22.ligar();
        s22.status();

        s22.desbloquear();
        s22.status();

        s22.abrirWhatsapp();
        s22.status();

        s22.abrirInstagram();
        s22.status();

        s22.fecharWhatsapp();
        s22.status();

        s22.fecharInstagram();
        s22.status();

        s22.bloquear();
        s22.status();

        s22.desligar();
        s22.status();
        s22.statusLogico();

    }
}
