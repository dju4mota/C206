public class Engenheiro extends Profissao {

    public String area;

    public Engenheiro(String nome, String area) {
        super(nome);
        this.area = area;
    }

    // this
    // super

    @Override
    public float calcularSalario(float salario) {
        return salario* 1.5f;
    }

    public void programar(){
        System.out.println("Programando ...");
    }

    @Override
    public String toString() {
        return super.toString() + " area" + area;
    }
}
