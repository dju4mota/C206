public class Arma {
    private int dano;
    private int custoDeEnergia;

    public int getDano() {
        return dano;
    }
    public int getCustoDeEnergia() {
        return custoDeEnergia;
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
