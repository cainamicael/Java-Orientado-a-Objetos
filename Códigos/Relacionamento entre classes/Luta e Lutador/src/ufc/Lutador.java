package ufc;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private double altura, peso;
    private int idade, vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura,  double peso,
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        setPeso(peso);
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.peso < 52.2 ){
            this.categoria = "Innválido";
        } else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9 ){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "inválida";
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Métodos

    public void apresentar(){
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de  " + this.getNacionalidade());
        System.out.println("com  " + this.getIdade() + " anos");
        System.out.println("com  " + this.getPeso() + " kg");
        System.out.println("com  " + this.getVitorias() + " vitórias");
        System.out.println("com  " + this.getDerrotas() + " derrotas");
        System.out.println("com  " + this.getEmpates() + " empates");
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.printf("Ganhou %d vez(es), perdeu %d vez(es) e empatou %d vez(es)",this.getVitorias(), this.getDerrotas(), this.getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
    
}
