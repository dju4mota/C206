import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        estoque.addEstoque(new Produto(10, "a"));
        estoque.addEstoque(new Produto(5, "b"));
        estoque.addEstoque(new Produto(2, "c"));
        estoque.ordenarEstoque();
        System.out.println(estoque.getLista());

    }
}
