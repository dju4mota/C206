import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<Integer>();

//        Thread tInput = new ThreadInput();
//        Thread tMusica = new ThreadMusica();
        Thread tTempo = new ThreadTempo(2, lista);


//        tInput.setPriority(1);
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        System.out.println(rand);
//        new ThreadTempo(15,lista).start();
//        new ThreadTempo(7,lista).start();
//        new ThreadTempo(3,lista).start();
//        tTempo.start();


//        tMusica.start();
//        tInput.start();





    }
}
