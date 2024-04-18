public class Conta {
    private double saldo;
    private double limite;


    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
