import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Processo[] processos = new Processo[10];

        // criando os processos
        for(int i = 0; i < 10;i++){
            processos[i] = new Processo();
        }

        System.out.println(" \n First Come First Serve \n");
        for (Processo p: processos) {
            System.out.println(p);
        }
        System.out.println(Sheduller.tempoMedioDeEspera(processos));

        System.out.println("\n Shortest Job First \n");
        Processo[] sjf = Sheduller.SJF(processos);
        for (Processo p: sjf) {
            System.out.println(p);
        }
        System.out.println(Sheduller.tempoMedioDeEspera(sjf));


        System.out.println("\n Priority \n");
        Processo[] ps = Sheduller.PS(processos);
        for (Processo p: ps) {
            System.out.println(p);
        }
        System.out.println(Sheduller.tempoMedioDeEspera(ps));


        Processo[] processos2 = new Processo[5];
        processos2[0] = new Processo(10,3);
        processos2[1] = new Processo(1,1);
        processos2[2] = new Processo(2,3);
        processos2[3] = new Processo(1,4);
        processos2[4] = new Processo(5,2);

        System.out.println(" \n First Come First Serve \n");
        for (Processo p: processos2) {
            System.out.println(p);
        }
        System.out.println(Sheduller.tempoMedioDeEspera(processos2));

        System.out.println("\n Shortest Job First \n");
        Processo[] sjf2 = Sheduller.SJF(processos2);
        for (Processo p: sjf2) {
            System.out.println(p);
        }
        System.out.println(Sheduller.tempoMedioDeEspera(sjf2));

        System.out.println("\n Priority \n");
        Processo[] ps2 = Sheduller.PS(processos2);
        for (Processo p: ps2) {
            System.out.println(p);
        }
        System.out.println(Sheduller.tempoMedioDeEspera(ps2));

    }
}
