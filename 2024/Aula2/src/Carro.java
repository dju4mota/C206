public class Carro {
    public Motor motor;
    public int tipoDePneu;

    public void correr(){
        System.out.println("Correndo");
    }


    public void acionarTurbo(){
        try {
            this.motor.turbo = true;
        } catch (NullPointerException e){
            System.out.println("Erro: " + e);
        }
    }

    public Carro(int tipoDePneu,int potencia, boolean turbo){
        this.tipoDePneu = tipoDePneu;
        //this.motor = new Motor(potencia,turbo);

    }
}
