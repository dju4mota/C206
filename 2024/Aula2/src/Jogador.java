public class Jogador {

    private Arma arma;
    int vida;
    int energia;

    public Jogador(){

    }
    public Jogador(Arma arma, int vida, int energia) {
        this.arma = arma;
        this.vida = vida;
        this.energia = energia;
    }
    public Jogador(int vida, int energia) {
        this.vida = vida;
        this.energia = energia;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void atacar(Jogador alvo){

        if(this.energia> this.arma.custoDeEnergia){
            alvo.vida -= this.arma.getDano();
            this.energia -= this.arma.custoDeEnergia;
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
