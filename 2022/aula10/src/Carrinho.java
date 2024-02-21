import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void ordena(){
        Collections.sort(produtos);
    }
}
