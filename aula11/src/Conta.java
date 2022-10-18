public class Conta {

    private int numero;
    private String nome;
    private double saldo;
    private double limite;


    Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }


//    palavra chave throws na assinatura da função para passar esse erro para frente, para tratar em outro lugar
    public void sacar(double valor) throws SaqueInvalido{
        if(valor <= this.saldo || valor <= limite){
            this.saldo -= valor;
            System.out.println("Saque realizado");
        } else{
//             Lança excepiton
            throw new SaqueInvalido();
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }



}
