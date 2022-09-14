package exercicio;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro(230, "prata", 2);
        Moto m1 = new Moto(100, "vermelha", 50 );
        Bicicleta b1 = new Bicicleta(21);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        m1.acelerar();
        m1.empinar();

        b1.empinar();

    }
}
