public class Engenheiro extends Profissao {

    public String area;

    public Engenheiro(String nome, String area) {
        super(nome);
        this.area = area;
    }

    @Override
    public float calcularSalario(float salario) {
        return super.calcularSalario(salario) * 1.5f;
    }

    @Override
    public String toString() {
        return super.toString() + " area" + area;
    }
}
