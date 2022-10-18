package exercicio;

public class Produto {

    private String nome;
    private double preco;

    public String etiquetaPreco(){

        return "Nome: " + nome + " Preco: " + preco;
    }
}
