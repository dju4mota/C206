//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Musico mcr = new Musico();
//
//        mcr.adicionar(new Album("Black Parade",10));
//        mcr.adicionar(new Album("Three cheers",10));
//
//        mcr.listar();
//
//        //mcr.deletar(0);
//        //mcr.deletar("Three cheers");
//        mcr.listar();
//
//        System.out.println(mcr.buscar("Black Parade"));

        Autor autor = new Autor("Isaac Asimov");

        // opção 1
        autor.adicionarSaga(new Saga(10, "Fundação"));
        autor.getSagas()[0].adicionarLivro(new Livro("Fundaçao", 315));
        autor.getSagas()[0].adicionarLivro(new Livro("Fundacao e Imperio", 350));


        // opção 2
        Saga saga = new Saga(9,"Robos");
        Livro lirvo1 = new Livro("",1);
        saga.adicionarLivro(lirvo1);
        saga.adicionarLivro(new Livro("Eu robo", 10));
        saga.adicionarLivro(new Livro("As Cavernas de Aço", 8));
        autor.adicionarSaga(saga);


    }
}