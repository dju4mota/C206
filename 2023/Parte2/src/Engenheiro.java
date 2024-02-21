public class Engenheiro extends Profissao implements GerenciaProjeto{

    String area;

    public Engenheiro(String nome, int idade, double salario, String area) {
        super(nome, idade, salario);
        this.area = area;
    }

    public void calcular(){
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() * 1.2;
    }


    @Override
    public String trabalhar() {
        calcular();
        return "Esta trabalhando";
    }

    @Override
    public String toString() {
        return super.toString() +" " +  area;
    }

    @Override
    public void gerencia() {
        System.out.println("Gerenciando");
    }
}
