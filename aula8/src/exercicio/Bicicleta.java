package exercicio;

public class Bicicleta implements  Manobras{

    private int numeroDeMarchas;

    Bicicleta(int numeroDeMarchas){
        this.numeroDeMarchas = numeroDeMarchas;
    }
    @Override
    public void empinar() {
        System.out.println("Empinando Bicicleta");
    }
}
