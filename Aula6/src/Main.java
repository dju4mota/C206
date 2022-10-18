public class Main {
    public static void main(String[] args) {

        Personagem p1 = new Personagem(10, "Nick", new Poder(5));

//        p1.vida = 1000;

        p1.setVida(50);

        System.out.println(p1.getVida());

        p1.addItem(new Item(10));
        p1.addItem(new Item(15));

        p1.mostraItems();
        Personagem.teste();
        p1.teste();
    }
}