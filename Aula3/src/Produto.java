public class Produto {


//    Atributos (variáveis)
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;


//    Construtor vazio
    Produto(){}

//    Construtor com parâmetros
    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

//   Método para imprimir os dados do produto
    void mostraInfo(){}

}
