public class Main {
    public static void main(String[] args) {


//        Primeiro Exercício

//        Criando objeto da classe Carrinho
        Carrinho c1 = new Carrinho();

//       Criando lista de produtos
        Produto[] produtos = new Produto[3];
//        Criando produtos dentro da lista
        produtos[0] = new Produto("Monitor", "Monitor de 24 polegadas", "Asus", 1500.00);
        produtos[1] = new Produto("Mouse", "Mouse padrão", "Logitech", 50.00);

//        Agregação - a lista foi criada na main e passada para o objeto c1
        c1.produtos = produtos;

//        Chamando os métodos do objeto c1
        c1.calculaTotal();
        c1.exbirInfos();

// -----------------------------------------------


//       Segundo Exercício

//        Criando objeto da classe Empresa e passando os parâmetros
        Empresa e1 = new Empresa("123456789", "Rua dois de outubro, nº 0");

//        Criando objeto da classe Contato dentro da lista da Empresa e passando os atributos por parâmetro
        e1.contatos[0] = new Contato("João", "joao@gmail" , "1234-5689", "01/01/1990");
        e1.contatos[1] = new Contato("Maria", "maria@gmail" , "9876-5432", "01/01/1990");

//      Chamando o método exibirInfos do objeto e1
        e1.exibirInfos();



//        -----------------------------------------------
//        Terceiro Exercício

        Restaurante r1 = new Restaurante("123456789", "Rua dois de outubro, nº 0", "Restaurante do João");

        r1.fornecedores[0] = new Fornecedor("Cerveja", 10);
        r1.fornecedores[1] = new Fornecedor("Refrigerante", 20);
        r1.fornecedores[2] = new Fornecedor("Pizza", 30);

        r1.exibirInfos();

    }
}