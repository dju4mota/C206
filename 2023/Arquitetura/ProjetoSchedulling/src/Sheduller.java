import java.lang.reflect.Array;
import java.util.Arrays;

public class Sheduller {

    static public Processo[] SJF(Processo[] processos){

        for (int i = 0; i < processos.length; i++)
        {
            for (int j = i + 1; j < processos.length; j++)
            {
                Processo tmp;
                if (processos[i].getBurstTime() > processos[j].getBurstTime())
                {
                    tmp = processos[i];
                    processos[i] = processos[j];
                    processos[j] = tmp;
                }
            }
//            System.out.println(processos[i]);

        }
        return processos;
    }
    static public Processo[] PS(Processo[] processos){
        for (int i = 0; i < processos.length; i++)
        {
            for (int j = i + 1; j < processos.length; j++)
            {
                Processo tmp;
                if (processos[i].getPriority() > processos[j].getPriority())
                {
                    tmp = processos[i];
                    processos[i] = processos[j];
                    processos[j] = tmp;
                }
            }
//            System.out.println(processos[i]);
        }
        return processos;
    }

    static public double tempoMedioDeEspera(Processo[] processos){
        double soma = 0;
        for (int i = processos.length - 2; i >= 0 ; i--) {
            for (int j = i; j >= 0; j--) {
                soma += processos[j].getBurstTime();
//                System.out.print(processos[j].getBurstTime() + " ");
            }
//            System.out.println();
        }
        return soma / processos.length ;
    }

}
