import java.util.concurrent.TimeUnit;

public class ThreadSoltarMagia extends Thread {
    Magia spell;

        public ThreadSoltarMagia(Magia magia){
            spell = magia;
        }

        @Override
        public void run(){
            try{
                TimeUnit.SECONDS.sleep(3);
                System.out.println(spell.getNome() + " foi conjurado");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
}
