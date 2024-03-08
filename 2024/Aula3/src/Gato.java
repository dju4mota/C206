public class Gato {

    private static int numeroDeGatos = 0;
    private String nome;
    private int idade;
    private int velocidade;

    public  Gato(){
        numeroDeGatos++;
    }

    public static int getNumeroDeGatos(){
        return numeroDeGatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if(velocidade <100){
            this.velocidade = velocidade;
        } else {
            System.out.println("Erro");
        }
    }
}
