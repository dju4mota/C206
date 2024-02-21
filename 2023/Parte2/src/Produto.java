public class Produto {
    private String nome;
    private double preco;

    public String etiquetaPreco(){
        return  nome + " " + preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
