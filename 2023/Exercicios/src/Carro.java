public class Carro {

    private Motor motor;
    private int tipoDePneu;

    public void correr(){
        System.out.println(motor + " " + tipoDePneu);
    }

    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        this.tipoDePneu = tipoDePneu;
        this.motor = new Motor(potencia, turbo);
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getTipoDePneu() {
        return tipoDePneu;
    }

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    @Override
    public String toString() {
        return "Carro: " + motor +
                " tipoDePneu= " + tipoDePneu ;
    }
}
