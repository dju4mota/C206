public class Steve {

    public int fome;
    public int armadura;
    public float xp;
    public Ferramenta ferramentaAtual;

    public void corer(){
        System.out.println("Correndo");
    }
    public void andar(){
        System.out.println("Andando");
    }

    public void andar(int n){

    }


    @Override
    public String toString() {
        return "Vida: " + this.vida + " Fome" + this.fome +
                " Armadura:" + this.armadura + " XP:" + this.xp ;
    }

    public int vida;

    Steve(int vida, int fome, Ferramenta ferramenta){
        this.ferramentaAtual = ferramenta;
        this.vida = vida;
        this.fome = fome;
        System.out.println("Steve criado");
    }

    Steve(int vida, int fome){
        this.vida = vida;
        this.fome = fome;
        System.out.println("Steve criado");
    }
    public Steve(){

    }
}
