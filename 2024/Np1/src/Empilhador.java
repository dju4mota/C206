import java.util.Arrays;

public class Empilhador extends Robo {

    private Pacote[] pacotes;
    private int pesoMaximo;


    public Empilhador(int energia, int energiaMaxima, String nome, int pesoMaximo) {
        super(energia, energiaMaxima, nome);
        this.pesoMaximo = pesoMaximo;
        pacotes = new Pacote[10];
    }

    public void adicionarPacote(int peso){
        if(peso < pesoMaximo) {
            for (int i = 0; i < pacotes.length; i++) {
                if (pacotes[i] == null) {
                    pacotes[i] = new Pacote(peso);
                    return;
                }
            }
            System.out.println("Sem espaço");
        }else {
            System.out.println("Peso Maximo atingido");
        }
    }
    public void removePacote(int posicao){
        pacotes[posicao] = null;
    }

    public void mostraPacote(){
        System.out.println("Pesos dos pacotes");
        for (int i = 0; i < pacotes.length; i++) {
            if(pacotes[i] != null){
                System.out.println(pacotes[i].getPeso());
            }
        }
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Empilhador{" +
                "pacotes=" + Arrays.toString(pacotes) +
                ", pesoMaximo=" + pesoMaximo +
                '}';
    }
}
