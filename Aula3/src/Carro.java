public class Carro {

//    Atributos (variáveis)
    String cor;
    String marca;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;
    Motor motor;


//    Construtor sem parâmetros
    Carro(){

//  Criando um objeto do tipo Motor - Composição
//        sem passar parâmetros para o motor
        this.motor = new Motor();
    };


//    Construtor com parâmetros
    Carro(String cor, String marca, String modelo, double velocidadeMaxima, double velocidadeAtual,int potenciaMotor, String tipoMotor){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
//  Criando um objeto do tipo Motor - Composição
//        passando parâmetros para o motor
        this.motor = new Motor(potenciaMotor, tipoMotor);
    }


//    Método para acelerar o carro
    void acelerar(){
        this.velocidadeAtual += 20;
    }

//    Método para ligar o carro
    void ligar(){
        System.out.println("O carro está ligado");
    }

//    Método para mostrar as informações do carro e do motor
    void mostraInfo(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade atual: " + this.velocidadeAtual);
        System.out.println("Tipo do Motor: " + this.motor.tipo);
        System.out.println("Potência do Motor: " + this.motor.potencia);
    }

}
