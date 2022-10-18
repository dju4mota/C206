public class Arma {
    private int dano;
    private String nome;

    public Arma(int dano, String nome) {
        this.dano = dano;
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
