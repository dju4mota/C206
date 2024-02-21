public class Jogador {

    Arma arma;
    int energia;
    int vida;
    static int id;

    static public void  teste(){
        System.out.println("teste");
    }

    public void atacar(Jogador alvo){
        if(this.energia >= arma.custoDeEnergia) {
            alvo.vida -= arma.dano;
            this.energia -= arma.custoDeEnergia;
        }
    }

    public String toString(){
        return " Arma " + arma  +
                " energia " + energia
                + " vida " + vida;
    }
}
