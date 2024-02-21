import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class ThreadTempo extends Thread{


    private int x;
    ArrayList<Integer> lista;

    public ThreadTempo(int x, ArrayList<Integer> lista) {
        this.x = x;
        this.lista = lista;
    }

    @Override
    public void run() {
        for (int i = 0; i < x; i++) {
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lista.add(x);
        System.out.println(lista);
    }
}