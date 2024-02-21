public class Magia implements Comparable {
    private int nivel;
    private String nome;

    public Magia(String nome, int nivel){
        this.nome = nome;
        this.nivel = nivel;

    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return nome + " " + nivel;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare( ((Magia) o).getNivel(), this.nivel);
    }
}
