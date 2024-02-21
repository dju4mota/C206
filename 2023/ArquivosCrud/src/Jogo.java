public class Jogo {

    private double preco;
    private String nome;
    private int id;

    public Jogo(double preco, String nome, int id) {
        this.preco = preco;
        this.nome = nome;
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Jogo { ID: " + this.getId() + " nome: " + this.getNome() + " preco: " + this.getPreco() +" }" ;
    }
}
