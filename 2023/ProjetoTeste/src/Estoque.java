import java.util.ArrayList;
import java.util.Collections;

public class Estoque {

    public void ordenarEstoque(){
        Collections.sort(lista);
    }

    private ArrayList<Produto> lista = new ArrayList<Produto>();

    public void addEstoque(Produto produto){
        lista.add(produto);
    }

    public ArrayList<Produto> getLista() {
        return lista;
    }
}
