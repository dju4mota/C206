public class Robo {
    private int energia;
    private int energiaMaxima;
    private String nome;

    static private int totalDeRobos = 0;

    public void trabalhar(){
        System.out.println("Trabalhando");
        energia--;

    }
    public void trocarEnergia(Robo roboAlvo){
        int energiaTrocada = 4;
        if(energia > energiaTrocada){
            roboAlvo.energia += energiaTrocada;
            if(roboAlvo.energia > roboAlvo.energiaMaxima){
                roboAlvo.energia = roboAlvo.energiaMaxima;
            }
            this.energia -= energiaTrocada;
            System.out.println("Energia trocada");
            return;
        }
        System.out.println("Energia insuficiente");
    }

    public void recarregar(int horas){
        // recarrega 1 energia por hora
        energia += horas;
        if(energia > energiaMaxima){
            // garante que nao vai passar a energiaMaxima
            energia = energiaMaxima;
        }
        System.out.println("Robo carregado");
    }

    public Robo(int energia, int energiaMaxima, String nome) {
        this.energia = energia;
        this.energiaMaxima = energiaMaxima;
        this.nome = nome;
        Robo.totalDeRobos++;
    }

    @Override
    public String toString() {
        return "Robo{" +
                "energia=" + energia +
                ", energiaMaxima=" + energiaMaxima +
                ", nome='" + nome + '\'' +
                '}';
    }
}
