import java.util.Arrays;

public class Equipe {

    private Carro carro;
    private Piloto[] pilotos = new Piloto[4];
    private Piloto pilotoAtual ;
    private String nome;

    private boolean trocarPiloto(int pilotoId){
        for (Piloto piloto: pilotos){
                if(piloto != null)
                    if(piloto.getId() == pilotoId){
                        pilotoAtual = piloto;
                        return true;
                    }
        }
        return false;
    }

    private boolean trocarPneu(int tipoDePneu){
        this.carro.setTipoDePneu(tipoDePneu);
        return true;
    }

    public void pitStop(int pilotoId, int tipoDePneu){
        if(trocarPiloto(pilotoId) && trocarPneu(tipoDePneu))
            System.out.println("PitStop feito com sucesso");
        else
            System.out.println("PitStop falhou");
    }

    public boolean adicionarPiloto(Piloto piloto){
        for (int i = 0; i<pilotos.length; i++){
            if(pilotos[i] == null){
                pilotos[i] = piloto;
                return true;
            }
        }
        return false;
    }

    public boolean retirarPiloto(int pilotoId){
        for (int i = 0; i<pilotos.length; i++){
            if(pilotos[i] != null)
                if(pilotos[i].getId() == pilotoId){
                    pilotos[i] = null;
                    return true;
            }
        }
        return false;
    }

    public Equipe(String nome){
        this.nome = nome;
    }

    public void construirCarro(int tipoDePneu, int potencia, boolean turbo){
        this.carro = new Carro(tipoDePneu,potencia, turbo);
    }

    public Carro getCarro() {
        return carro;
    }

    public Piloto getPilotoAtual() {
        return pilotoAtual;
    }

    @Override
    public String toString() {
        return "Equipe " + nome +
                carro +
                " pilotos: " + Arrays.toString(pilotos) +
                " pilotoAtual: " + pilotoAtual ;
    }
}
