//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

  //      System.out.println(fatorial(5));
//        mostraPares(23);
        Lista lista = new Lista();
        lista.teste();


    }

    public static int fatorial(int n){
        if(n == 1){
            return 1;
        } else {
            return n * fatorial(n-1);
        }
    }

    public static void mostraPares(int n){
        for(int i = 0; i <= n; i +=2 ){
            System.out.println(i);
        }
    }

    public static float calculaMedia(float valorTotal, int totalDeItens){
        return valorTotal/totalDeItens;
    }
}