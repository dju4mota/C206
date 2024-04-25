//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Item[] listaDeCompras = new Item[10];
        GerenciadorDeCompras gerenciadorDeCompras = new GerenciadorDeCompras(listaDeCompras);

        try {
            listaDeCompras[9] = new Item(10);
        } catch (ArrayIndexOutOfBoundsException erro){
            // listaDeCompras[9] = new Item(10f);
            System.out.println("-> " + erro);
        } finally {
            System.out.println("acabouu");
        }


        // listaDeCompras[0].getValor();
        try {
            gerenciadorDeCompras.add(new Item(5f), 15);
        }catch (Exception erro){
            System.out.println("-> " + erro);
        }

    }
}