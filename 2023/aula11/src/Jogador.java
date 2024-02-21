public class Jogador implements Comparable<Jogador>{

    private int id;
    private String userName;
    private static int controleOrdenacao;

    public static int getControleOrdenacao() {
        return controleOrdenacao;
    }

    public static void setControleOrdenacao(int controleOrdenacao) {
        Jogador.controleOrdenacao = controleOrdenacao;
    }

    public Jogador(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public void jogar(){
        System.out.println("Jogar");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return  "id= " + id +
                " userName= " + userName ;
    }


    @Override
    public int compareTo(Jogador jogador) {
        return Integer.compare(this.getId(), jogador.getId());
//        return this.getUserName().compareTo(jogador.getUserName()) * -1;
    }
}
