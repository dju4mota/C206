public abstract class Profissao {
    public String nome;

    @Override
    public String toString() {
        return "Nome" + nome;
    }
    public abstract void trabalhar(int horas);

    public Profissao(String nome) {
        this.nome = nome;
    }

    public float calcularSalario(float salario){
        return salario;
    }
}
