public class Carro {

    int velocidade;
    String cor;
    String modelo;
    String marca;
    Motor motor;

    Carro(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = 0;
        motor = new Motor(10,10);
    }

    public void acelerar(int velocidade){
        this.velocidade += velocidade;
    }

    public void freiar(){

    }

    public void ligarFarois(){

    }

    public void virar(){

    }

    @Override
    public String toString() {
        return "marca " + marca + " modelo " + modelo;
    }


}
