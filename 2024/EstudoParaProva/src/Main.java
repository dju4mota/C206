import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        estoque.adcionarArray(new Item(10,"pc"));
        estoque.adcionarArray(new Item(20,"note"));
        estoque.adcionarArray(new Item(15,"mouse"));
        Item item1 = new Item(5,"fone");
        estoque.adcionarArray(item1);
        estoque.adcionarArray(item1);

        estoque.mostrarItens();
        // ordena
        System.out.print("Sort -> ");
        Collections.sort(estoque.getItensArray());
        estoque.mostrarItens();

        // pega o maior valor
        System.out.print("Max -> ");
        System.out.println(Collections.max(estoque.getItensArray()).getNome());
        // pega o menor valor
        System.out.print("Min -> ");
        System.out.println(Collections.min(estoque.getItensArray()).getNome());

        ArrayList<Item> listaAuxiliar = new ArrayList<>();
        listaAuxiliar.add(new Item(35,"rtx 4090"));
        listaAuxiliar.add(new Item(30,"rtx 3090"));

        // adiciona todos os itens da lista auxiliar na lista do estoque
        System.out.print("AddAll -> ");
        estoque.getItensArray().addAll(listaAuxiliar);
        estoque.mostrarItens();
        // deleta todos os itens da lista auxiliar na lista do estoque
        System.out.print("RemoveAll -> ");
        estoque.getItensArray().removeAll(listaAuxiliar);
        estoque.mostrarItens();

        // contains isEmpty , size
        System.out.print("IndexOf -> ");
        System.out.println(estoque.getItensArray().indexOf(item1));
        System.out.print("LastIndexOf -> ");
        System.out.println(estoque.getItensArray().lastIndexOf(item1));

        System.out.print("Contains -> ");
        System.out.println(estoque.getItensArray().contains(item1));
        System.out.print("isEmpty -> ");
        System.out.println(estoque.getItensArray().isEmpty());
        System.out.print("Size -> ");
        System.out.println(estoque.getItensArray().size());


    }
}