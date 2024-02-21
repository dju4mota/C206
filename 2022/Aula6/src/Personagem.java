public class Personagem {

//    Atributos
    private int vida;
    private String nome;
    private Poder poder;
    private Item[] items;

//    Construtor com parâmetros
    Personagem(int vida, String nome,Poder poder ){
        this.vida = vida;
        this.nome = nome;
        this.poder = poder;
        this.items = new Item[10];

    }
    static void  teste(){
        System.out.println("teste");
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    // getters e setters com a lista inteira
    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
//  outros métodos uteis para trabalhar com listas
    public void mostraItems(){
        for (Item item : items) {
            if(item != null){
                System.out.println(item.preco);
            }
        }
    }
    public void addItem(Item item){
        for (int i = 0; i < items.length;i++){
            if(items[i] == null){
                items[i] = item;
                break;
            }
        }
    }

}
