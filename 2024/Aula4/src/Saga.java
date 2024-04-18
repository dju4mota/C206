public class Saga {
    private int nota;
    private String nome;
    private Livro[] livros;

    public Saga(int nota, String nome) {
        this.nota = nota;
        this.nome = nome;
        livros = new Livro[5];
    }

    public int getNota() {
        return nota;
    }
    public String getNome() {
        return nome;
    }

    public void listarLivros(){
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println("Titulo " + livro.getTitulo());
                System.out.println(livro.getPaginas() + " paginas");

                // ou
                // Caso tenha implementado o toString na classe livro pode só printar o objeto direto
                // System.out.println(livro);
            }
        }
    }

    public void adicionarLivro(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] == null){
                livros[i] = livro;
                break;
            }
        }
    }
}
