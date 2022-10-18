public abstract class  Personagem {

    private int vida;
    private int poder;
    private int energia;
    private String nome;

    void usarHabilidade(){
        System.out.println("Usando habilidade");
    }

    public Personagem(int vida, int poder, int energia, String nome) {
        this.vida = vida;
        this.poder = poder;
        this.energia = energia;
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
