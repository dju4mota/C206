import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class ThreadInput extends Thread{

    String texto = "welcome to the black parade";
    boolean ganhou = true;

    @Override
    public void run() {

        System.out.println("Escreva palavra por palavra: " + texto);
        Scanner scan = new Scanner(System.in);

        for (String palavra : texto.split(" ")) {
            String aux = scan.next();
            System.out.println(aux);
            if(!aux.equals(palavra)){
                ganhou = false;
            }
        }


        System.out.println(ganhou ? "Ganhou" : "Perdeu");
    }
}