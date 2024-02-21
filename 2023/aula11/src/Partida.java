import java.util.ArrayList;

public class Partida {

    ArrayList<Jogador> jogadores = new ArrayList<>();


    public void incluir(Jogador jogador){
        jogadores.add(jogador);
    }

    public void exlcuir(Jogador jogador){
        jogadores.remove(jogador);
    }
    public void excluir(int index){
        jogadores.remove(index);
    }

    public void atualizar(Jogador jogador){
        int index = jogadores.indexOf(jogador);
        jogadores.set(index, jogador);

    }

    public Jogador buscar(Jogador jogador){
        int index = jogadores.indexOf(jogador);
        return jogadores.get(index);
    }

    public Jogador buscar(int index){
        return jogadores.get(index);
    }


}
