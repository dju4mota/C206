package exemplo;

public class Professor extends  Funcionario{
    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    public void corrigirProvas(){
        System.out.println(super.getNome() + " corrigiu as provas!");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Materia: " + this.materia);
    }

    @Override
    public void executaAcao() {
        System.out.println(super.getNome() + " esta corrigindo provas");
    }
}
