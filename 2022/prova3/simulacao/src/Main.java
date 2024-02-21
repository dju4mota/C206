public class Main {
    public static void main(String[] args) {

        Bruxo lux = new Bruxo();
        Lutador garen = new Lutador();
        Magia m = new Magia("Q", 1);
        lux.adicionaMagia(m);
        lux.setNome("Lux");
        lux.setEnergia(300);
        lux.setVida(150);

        garen.setNome("Garen");
        garen.setEnergia(10);
        garen.setVida(500);
        garen.setDanoDaArma(30);

        lux.adicionaMagia(lux.m1);
        lux.adicionaMagia(lux.m2);
        lux.adicionaMagia(lux.m3);
        lux.adicionaMagia(lux.m4);
//
//        System.out.println(lux.getMagias());
//
//        lux.deletaMagia(lux.m1);
//
//        lux.soltarMagia(lux.m4);
//
//        garen.atacar(lux, garen.getDanoDaArma());

        System.out.println(lux.getMagias());

    }
}
