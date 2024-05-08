import java.util.ArrayList;

public class Estoque {
    private ArrayList<Item> itensArray = new ArrayList<>();

    public void adcionarArray(Item item){
        itensArray.add(item);
    }

    public Item buscar(int posicao){
        return  itensArray.get(posicao);
    }

    public void deletar(int posicao){
        itensArray.remove(posicao);
    }

    public void deletar(Item item){
        itensArray.remove(item);
    }
    public void modificar(Item item, int posicao){
        itensArray.set(posicao, item);
    }

    public ArrayList<Item> getItensArray() {
        return itensArray;
    }

    public void mostrarItens(){
        System.out.print("[");
        for (Item item : itensArray){
            try{
                System.out.print("  " + item.getNome() + " - " + item.getValor() + ", ");
            }catch (NullPointerException e){
                System.out.println("Error: " + e);
            }
        }
        System.out.println("]");
    }

}
