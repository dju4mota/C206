public class Produto {

//    Atributos (variáveis)
    String nome;
    String descricao;
    String fabricante;
    double preco;

//    Construtor com parâmetros
    Produto(String nome, String descricao, String fabricante, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.preco = preco;
    }

//    Construtor sem parâmetros
    Produto(){};
}
