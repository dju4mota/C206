public class Main {
    public static void main(String[] args) {

        Cadastro cad = new Cadastro();

        Funcionario fun = new Funcionario(140);
        Funcionario fun1 = new Funcionario(150);
        Funcionario fun2 = new Funcionario(130);
        cad.create(fun);
        cad.create(fun1);
        cad.create(fun2);
//        System.out.println(cad.read(fun).getCpf());
        System.out.println(fun);

        System.out.println(cad.readIndex(fun2));
        cad.readAll();
        cad.ordena();
        System.out.println(cad.readIndex(fun2));

        cad.readAll();


        Carrinho carrinho = new Carrinho();
        Produto prod1 = new Produto("Arroz", 13.0);
        Produto prod2 = new Produto("Feijao", 12.0);
        Produto prod3 = new Produto("Carne", 20.3);

        carrinho.addProduto(prod1);
        carrinho.addProduto(prod2);
        carrinho.addProduto(prod3);

        carrinho.ordena();
        System.out.println(carrinho.getProdutos());


    }
}