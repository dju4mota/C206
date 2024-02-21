public class Main {
    public static void main(String[] args) {


        Assassino assassino = new Assassino(50,10,10,"Guerbo","Faca",4);
        Guerreiro guerreiro = new Guerreiro(50,10,10,"Brutus","Espada",10);
        Mago mago = new Mago(50,30,10,"Merlim");

        assassino.atacar(guerreiro);
        guerreiro.atacar(mago);
        mago.usarHabilidade();
    }
}