public class Teste {

    public static void mostraNome(Profissao profissao){

        System.out.println(profissao.nome);
        if (profissao instanceof Engenheiro) {
            System.out.println( ((Engenheiro)profissao).area);
        }
        System.out.println(profissao.calculaSalario());
    }
}
