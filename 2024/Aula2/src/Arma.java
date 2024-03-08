public class Arma {
    private int dano;
    int custoDeEnergia;

    public int getDano() {
        return dano;
    }

    public Arma(int dano, int custoDeEnergia){
        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "dano=" + dano +
                ", custoDeEnergia=" + custoDeEnergia +
                '}';
    }
}
