package exercicio;

public abstract class VeiculoMotorizado {
    private int potencia;
    private String cor;
    private int velocidadeAtual;

    public VeiculoMotorizado(int potencia, String cor) {
        this.potencia = potencia;
        this.cor = cor;
        this.velocidadeAtual = 0;
    }

    public void acelerar() {
        velocidadeAtual+= 10;
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
    }
}
