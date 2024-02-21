import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Partida partida1 = new Partida();

        partida1.incluir(new Jogador(10, "tin"));
        partida1.incluir(new Jogador(4, "robo"));
        partida1.incluir(new Jogador(25, "croc"));

        System.out.println(partida1.jogadores);

//        partida1.excluir(1);

//        System.out.println(partida1.jogadores);

        System.out.println(Collections.max(partida1.jogadores));

        Collections.sort(partida1.jogadores);


        System.out.println(partida1.jogadores);

        Jogador.setControleOrdenacao(Ordenacao.ALFABETICA.getNum());

    }
}
