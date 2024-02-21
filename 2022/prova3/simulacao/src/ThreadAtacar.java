import java.util.concurrent.TimeUnit;
public class ThreadAtacar extends Thread{

    int MyDanoDaArma;
    Personagem p;
    public ThreadAtacar(Personagem alvo, int danoDaArma){
        p = alvo;
        MyDanoDaArma = danoDaArma;
    }

    @Override
    public void run(){
        try{
            TimeUnit.SECONDS.sleep(2);
            p.setVida(p.getVida()-MyDanoDaArma);
            System.out.println(p.getNome() + " foi atacada, ficando com " + p.getVida() + " de vida");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
