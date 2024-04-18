public class Main {
    public static void main(String[] args) {

//        Gato gatinho = new Gato();
//        Gato gatinho1 = new Gato();
//        Gato gatinho2 = new Gato();
//        gatinho.setNome("Morgana");
//        System.out.println(gatinho.getNome());
//
//        System.out.println(Gato.getNumeroDeGatos());

        System.out.println(Calculadora.circunferencia(3));
        System.out.println(Calculadora.volumeEsfera(3));
        System.out.println(Calculadora.volumeCilindro(3,5));
//
//
        Jogador jogador1 = new Jogador(50,20,new Arma(5,10));
        Jogador jogador2 = new Jogador(50,20,new Arma(5,10));
        Jogador jogador3 = new Jogador();
        Jogador jogador4 = new Jogador(10,10);
        jogador1.atacar(jogador2);

        double res = Calculadora.volumeCilindro(3,3);
        System.out.println(jogador1);
        System.out.println(jogador2);



    }
}