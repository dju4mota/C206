public class Mago extends Personagem{

    public Mago(int vida, int poder, int energia, String nome) {
        super(vida, poder, energia, nome);
    }

    @Override
    void usarHabilidade() {
        System.out.println("Conjunrado Magia");
    }
}
