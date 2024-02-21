public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta(1000, 2000);

        c1.depositar(500);

        try {
//            Tenta executar o código dentro do bloco try
            c1.sacar(120);
        } catch (Exception e){
//            Bloco de código caso a parte de cima gere alguma Exception
            System.err.println(e);
        } finally {
            System.out.println(" Operacao finalizada");
        }

        try {
            c1.sacar(120000);
        } catch (Exception e){
            System.out.println(e);
        }

    }
}