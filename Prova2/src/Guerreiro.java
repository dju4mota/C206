public class Guerreiro extends Personagem implements  LutarComArmas{

    private Arma arma;

    public Guerreiro(int vida, int poder, int energia, String nome, String nomeArma, int dano) {
        super(vida, poder, energia, nome);
        arma = new Arma(dano,nomeArma);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println("O Guerreiro atacou " +  alvo.getNome());
        alvo.setVida(alvo.getVida() - arma.getDano());
        System.out.println(alvo.getNome() + " esta com " + alvo.getVida() + " de vida.");
    }
}
