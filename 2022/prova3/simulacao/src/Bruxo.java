import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bruxo extends Personagem{
    private ArrayList<Magia> magias = new ArrayList<>();
    Magia[] res = new Magia[4];
    Magia m1 = new Magia("Q", 1);
    Magia m2 = new Magia("W", 2);
    Magia m3 = new Magia("E", 3);
    Magia m4 = new Magia("R", 4);

    public void adicionaMagia(Magia m){
        magias.add(m);
    }

    public void deletaMagia(Magia m){
        magias.remove(m);
    }

    public ArrayList<Magia> getMagias(){
        for (int i = 0; i < magias.size(); i++)
             res[i] = magias.get(i);
//        return res;
        return magias;
    }

    public void soltarMagia(int index){
        Thread spl = new ThreadSoltarMagia(magias.get(index));
        spl.start();
    }

    public int retornaIndexDaMagia(Magia magia){
        return magias.indexOf(magia);
    }

    public void ordenaMagias(){
        Collections.sort(magias);
    }
}
