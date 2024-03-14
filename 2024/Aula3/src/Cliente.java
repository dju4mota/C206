public class Cliente {

    private String nome;
    private String cpf;
    private Conta conta;


    public Cliente(String nome, String cpf, double saldo, double limite) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new Conta(saldo,limite);
    }

    public boolean sacarDinheiro(double valor){
        if(conta.getSaldo() >= valor){
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Valor transferido");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conta=" + conta +
                '}';
    }
}
