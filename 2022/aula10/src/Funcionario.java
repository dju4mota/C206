public class Funcionario implements Comparable{
    private int cpf;

    public Funcionario(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public int compareTo(Object funcionario) {
        Funcionario fun = (Funcionario) funcionario;
        return Integer.compare(this.getCpf(), fun.getCpf() );
    }

    @Override
    public String toString() {
        return  Integer.toString(this.cpf);
    }

}
