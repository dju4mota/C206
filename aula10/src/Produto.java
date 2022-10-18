public class Produto implements Comparable{

    private String nome;
    private double preco;
    public static int metodoDeOrdenacao= 1;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

//    Método para Comparação - esse método vai ser chamado pelo
//    própio Java quando tentarmos ordenar a lista
    @Override
    public int compareTo(Object o) {
        Produto produto = (Produto) o;
        if (metodoDeOrdenacao == 1){
            return Double.compare(this.preco, produto.getPreco());
        }
        return 0;
    }

//    Método para imprimir os dados mais facilmente, esse método vai ser chamado pelo
//    própio Java quando tentarmos imprimir um objeto
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
