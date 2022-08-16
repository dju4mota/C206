public class Main {
    public static void main(String[] args) {

//        Primeiro Exercício

//      Criando um objeto do tipo Produto
        Produto p1 = new Produto();

//      Atribuindo valores aos atributos do objeto p1
        p1.codigoSerie = 1;
        p1.codigoProduto = "123";
        p1.nome = "Notebook";
        p1.categoria = "Eletrônicos";
        p1.quantidade = 1;

//      Chamando o método mostraInfo() do objeto p1
        p1.mostraInfo();

//      Criando um objeto do tipo Produto e atribuindo valores aos atributos através do construtor
        Produto p2 = new Produto(2, "456", "Mouse", "Eletrônicos", 1);

//      Chamando o método mostraInfo() do objeto p2
        p2.mostraInfo();


//        ------------------------------------------------------------
//        Segundo Exercício


//  Criando um objeto do tipo Carro
        Carro c1 = new Carro();

//  Atribuindo valores aos atributos do objeto c1
        c1.modelo = "Onix";
        c1.cor = "Preto";
        c1.marca = "Chevrolet";
        c1.velocidadeMaxima = 200;
        c1.velocidadeAtual = 120;
//  Como foi o motor foi criado por Composição, não precisamos criar ele aqui na main, apenas passar os valores dos atributos
        c1.motor.potencia = 120;
        c1.motor.tipo = "1.0 Turbo";

//  Chamandos os métodos do objeto c1
        c1.ligar();
        c1.acelerar();
        c1.mostraInfo();

// Criando um objeto do tipo Carro e atribuindo valores aos atributos através do construtor
        //  Como foi o motor foi criado por Composição, não precisamos criar ele aqui na main, apenas passar os valores dos atributos
    Carro c2 = new Carro("Vermelho", "Fiat", "Uno", 200, 120, 120, "1.0 ");

//  Chamandos os métodos do objeto c2
        c2.ligar();
        c2.acelerar();
        c2.mostraInfo();


    }
}