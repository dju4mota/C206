import java.util.concurrent.TimeUnit;
public class ThreadTempo extends Thread{

    private int tempo;
    public ThreadTempo( int tempo){
     this.tempo = tempo;
    }

    @Override
    public void run() {
        for (int i = 0; i < tempo; i++) {
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
