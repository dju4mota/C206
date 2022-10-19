package exercicio;

public class Main {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Vostro",7000, 1, "GPU", "I7");
        Camiseta camiseta = new Camiseta("Camiseta Lacoste", 1200, "Laranja", "M");

        System.out.println(notebook.etiquetaPreco());
        System.out.println(camiseta.etiquetaPreco());

    }
}