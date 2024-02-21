import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Engenheiro eng = new Engenheiro("dju", 22, 2300, "Software");
        //Profissao profissao = new Profissao("jose", 38, 3000);
        Profissao professor = new Professor("maria", 30, 5000);
        Profissao eng2 = new Engenheiro("joao",25,4000,"Civil");


        Profissao[]  lista = new Profissao[4];

        lista[0] = eng;
        lista[1] = professor;

        lista[0].trabalhar();

        System.out.println(Arrays.toString(lista));

        Teste.mostraNome(eng);
        //Teste.mostraNome(profissao);



    }
}
