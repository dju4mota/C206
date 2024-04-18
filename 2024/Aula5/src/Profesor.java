public class Profesor extends Profissao{

    @Override
    public void trabalhar(int horas) {
        System.out.println("trabalhando");
        corrigirProvas();
    }

    public Profesor(String nome) {
        super(nome);
    }

    public void corrigirProvas(){
        System.out.println("Corrigindo as provas ...");
    }
}
