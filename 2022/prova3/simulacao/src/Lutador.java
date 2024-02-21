public class Lutador extends Personagem {

    private int danoDaArma;

    public int getDanoDaArma() {
        return danoDaArma;
    }

    public void setDanoDaArma(int dano) {
        danoDaArma = dano;
    }

    public void atacar(Personagem alvo, int danoDaArma) {
        Thread atk = new ThreadAtacar(alvo, danoDaArma);
        atk.start();
    }
}
