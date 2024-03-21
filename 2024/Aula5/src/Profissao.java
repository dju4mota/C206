public class Profissao {
    public String nome;

    @Override
    public String toString() {
        return "Nome" + nome;
    }

    public Profissao(String nome) {
        this.nome = nome;
    }

    public float calcularSalario(float salario){
        return salario;
    }
}
