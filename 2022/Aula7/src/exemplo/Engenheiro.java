package exemplo;

public class Engenheiro extends Funcionario {
    private String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Ramo: " + this.ramo);
    }

    public void executaAcao(){
        System.out.println(super.getNome() + " esta programando");
    }

}
