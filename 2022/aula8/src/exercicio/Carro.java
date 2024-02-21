package exercicio;

public class Carro extends VeiculoMotorizado{

    private int numeroDePortas;

    public Carro(int potencia, String cor, int numeroDePortas) {
        super(potencia, cor);
        this.numeroDePortas = numeroDePortas;
    }
}
