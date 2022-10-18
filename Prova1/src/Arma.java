public class Arma {

//    Atribtutos
    int dano;
    String nome;

//    Construtor com parâmetros
    Arma(int dano, String nome){
        this.dano = dano;
        this.nome = nome;
    }

//    Método
    void atacar(){
        System.out.println("Atacando ... " + dano + " de dano");
    }
}
