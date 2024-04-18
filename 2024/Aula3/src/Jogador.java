public class Jogador {

    private Arma arma;
    private int vida;
    private int energia;

    public Arma getArma() {
        return arma;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }


    public Jogador(){
    }
    public Jogador( int vida, int energia, Arma arma) {
        this.arma = arma;
        this.vida = vida;
        this.energia = energia;
    }

    public Jogador(int vida, int energia) {
        this.vida = vida;
        this.energia = energia;
    }


    public void atacar(Jogador alvo){

        if(this.energia> this.arma.getCustoDeEnergia()){
            //alvo.vida -= this.arma.getDano();
            alvo.setVida(alvo.getVida() - this.arma.getDano());
            this.energia -= this.arma.getCustoDeEnergia();
        }
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "arma=" + arma +
                ", vida=" + vida +
                ", energia=" + energia +
                '}';
    }
}
