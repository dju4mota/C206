//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Steve steve = new Steve(10,5);
//        Steve steve1 = new Steve(10,4,new Ferramenta());
//        Steve steve3 = new Steve();
//        steve.xp = 20;
//        steve.armadura = 3;
//
//        //steve.andar();
//        System.out.println(steve.vida);
//        steve.andar();
//        steve.andar();
//        System.out.println(steve);
//
//
//
//        //System.out.println(steve.fome);
//        Steve steve2 = new Steve(9,4);
//        System.out.println(steve2.vida);
//
//
//
//        Carro carro1 = new Carro(0,500,true);
//        System.out.println(carro1.tipoDePneu);
//        carro1.correr();
//        System.out.println(carro1.motor);
//        carro1.acionarTurbo();

//        Aluno aluno = new Aluno();
//        aluno.np1 = 60;
//        aluno.np2 = 50;
//        System.out.println(aluno.calculaMedia());
//        System.out.println(aluno);
        Arma arma = new Arma(10,10);
        Jogador jogador1 = new Jogador(new Arma(10, 10), 50, 100);
        Jogador jogador2 = new Jogador(arma,50,100);

        jogador2.vida = 1000000;

        System.out.println(jogador2);
        System.out.println(jogador1);

        jogador1.atacar(jogador2);

        System.out.println(jogador2);
        System.out.println(jogador1);
    }

}





