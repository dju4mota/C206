//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Olá ");

        int numero = 10;
        boolean flag = true;
        double n2 = 10;
        float n3 = 5f;
        char letra = 'F';

        String nome = "Fernando";
        System.out.println(nome.toLowerCase());
        Float n = 10f;

        System.out.println(calculaMedia(35f,10));
    }
    public static float calculaMedia(float valorTotal, int totalDeItens){
        return valorTotal/totalDeItens;
    }

}