public class Main {
    public static void main(String[] args) {

    Arma a1 = new Arma(5, "espada");
    Personagem p1 =  new Personagem(15, a1, "Guerreiro");

    p1.itens[0] = new Item("Cajado",10);
    p1.itens[1] = new Item("Mochila",2);


    p1.mostaInfo();

    p1.atacar();

    }
}