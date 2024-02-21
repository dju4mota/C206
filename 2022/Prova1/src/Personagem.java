public class Personagem {
//    Atributos
    int vida;
    Arma arma;
    String nome;
    Item[] itens;

//    Construtor
    Personagem(int vida, Arma arma, String nome){
        this.vida = vida;
        this.arma = arma;
        this.nome = nome;
        itens = new Item[10];
    }


//    Métodos
    void mostaInfo(){
        System.out.println("Vida " + this.vida);
        System.out.println("nome " + this.nome);
        System.out.println("Arma " + this.arma.nome);
        System.out.println("Dano da arma " + this.arma.dano);

        for (Item item : this.itens){
            if(item != null){
                System.out.println("Item: " + item.nome + " custa " + item.valor + " moedas");
            }
        }
    }

    void atacar(){
        this.arma.atacar();
    }

}
