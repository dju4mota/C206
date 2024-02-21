package exemplo;

public class Arquiteto extends Funcionario{
    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialidade: " + this.especialidade);
    }

    @Override
    public void executaAcao() {
        System.out.println(super.getNome() + " esta planejando");
    }
}
