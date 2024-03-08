//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gato gatinho = new Gato();
        Gato gatinho1 = new Gato();
        Gato gatinho2 = new Gato();
        gatinho.setNome("Morgana");
        System.out.println(gatinho.getNome());

        System.out.println(Gato.getNumeroDeGatos());


    }
}