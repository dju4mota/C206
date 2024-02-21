public class Professor extends Profissao{

    public void corrigirProvas(){
    }

    public String trabalhar(){
        corrigirProvas();
        return "Esta trabalhando ";
    }

    public Professor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }
}
