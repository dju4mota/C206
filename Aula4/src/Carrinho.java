public class Carrinho {

//    Atributos (variáveis)
    double total;
    Produto[] produtos; // Agregação

    // Construtor com parâmetros
    Carrinho(Produto[] produtos) {
//        Agregação
        this.produtos = produtos;
        this.total = 0;
    }

    // Construtor sem parâmetros
    Carrinho(){
        this.total = 0;
    };

//    Método para mostrar as informações
    void exbirInfos(){
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println(produto.nome + " - " + produto.preco);
            }
        }

        System.out.println("Total: " + total);
    }

    double calculaTotal(){
        for (Produto produto : produtos) {
            if (produto != null) {
               this.total += produto.preco;
            }
        }
        return this.total;
    }

}
