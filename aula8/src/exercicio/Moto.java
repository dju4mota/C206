package exercicio;

public class Moto  extends VeiculoMotorizado implements  Manobras{

    private int cilindradas;

    public Moto(int potencia, String cor, int cilindradas) {
        super(potencia, cor);
        this.cilindradas = cilindradas;
    }

    @Override
    public void empinar() {
        System.out.println("Empinando moto");
    }
}
