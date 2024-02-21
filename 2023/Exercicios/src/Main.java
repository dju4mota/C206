public class Main {
    public static void main(String[] args) {

        Equipe ferrari = new Equipe("Ferrari");
        Piloto charles = new Piloto("Charles Leclerc", 25, "Monogasco");
        Piloto sainz = new Piloto("Carlos Sainz", 28, "Espanhol");
        Piloto lewis = new Piloto("Lewis Hamilton", 32, "Ingles");
        Piloto alonso = new Piloto("Fernando ALonso", 39, "Espanhol");
        Piloto russel = new Piloto("George Russel", 23, "Ingles");

        ferrari.construirCarro(2,400,true);
        System.out.println(ferrari);
        System.out.println(charles);

        ferrari.adicionarPiloto(charles);
        ferrari.adicionarPiloto(lewis);
        System.out.println(ferrari.adicionarPiloto(alonso));
        ferrari.adicionarPiloto(sainz);
        ferrari.retirarPiloto(alonso.getId());
        System.out.println(ferrari.adicionarPiloto(russel));

        ferrari.pitStop(lewis.getId(),1);

        russel.correr(ferrari.getCarro(),ferrari.getPilotoAtual().getId());
        lewis.correr(ferrari.getCarro(),ferrari.getPilotoAtual().getId());

        System.out.println(ferrari);



    }
}
