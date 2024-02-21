public class ThreadFatorial extends Thread{

private final double numero;

    public ThreadFatorial(double numero) {
        this.numero = numero;
    }

    @Override
    public void run() {

        double fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
            System.out.println(fatorial);
        }
        System.out.println("Fatorial de " + numero + " = " + fatorial);

    }

}
