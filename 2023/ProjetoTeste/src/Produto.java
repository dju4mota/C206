public class Produto implements  Comparable<Produto>{
    private int preco;
    private String nome;

    @Override
    public int compareTo(Produto prod) {
        return Integer.compare(this.getPreco(), prod.getPreco());
    }

    public Produto(int preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}
