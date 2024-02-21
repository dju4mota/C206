public class Saga {
    Livro[] livros = new Livro[10];
    int nota;


    public void listaLivros(){
        for (Livro livro : livros) {
            if(livro != null) {
                System.out.println(livro.titulo);
            }
        }
    }

    public boolean adicionarLivros(Livro livro){
        for (int i= 0; i<livros.length; i++) {
            if(livros[i] == null) {
               livros[i] = livro;
               break;
            }
        }
        return false;
    }
}
