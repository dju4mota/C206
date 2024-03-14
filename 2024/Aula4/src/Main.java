//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Musico mcr = new Musico();

        mcr.adicionar(new Album("Black Parade",10));
        mcr.adicionar(new Album("Three cheers",10));

        mcr.listar();

        //mcr.deletar(0);
        //mcr.deletar("Three cheers");
        mcr.listar();

        System.out.println(mcr.buscar("Black Parade"));

    }
}