public class Piloto {

    private static int idGeral = 0 ;
    private String nome;
    private int idade;
    private int id;
    private String nacionalidade;

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        idGeral += 1;
        this.id = idGeral;
    }

    public void correr(Carro carro, int id){
        if(this.id == id) {
            System.out.println(nome + " esta correndo com: ");
            carro.correr();
        }
        else {
            System.out.println("Este piloto nao eh o piloto atual");
        }
    }

    @Override
    public String toString() {
        return "Piloto:" + nome  +
                " idade:" + idade +
                " id: " + id +
                " nacionalidade=" + nacionalidade ;
    }

    public int getId() {
        return id;
    }
}
