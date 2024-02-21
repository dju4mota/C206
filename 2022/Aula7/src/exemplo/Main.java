package exemplo;

public class Main {
    public static void main(String[] args) {


        Funcionario eng = new Engenheiro("Joao", 25, 5000,"Software");
        Funcionario arq = new Arquiteto("Lucas", 32, 8000,"Restaurantes");
        Funcionario prof = new Professor("Pedro", 37, 4500,"Matemática");
        Funcionario fun = new Funcionario("Gabriel", 23 , 3700);

        Funcionario[] listaDeFuncionarios = new Funcionario[5];

        listaDeFuncionarios[0] = eng;
        listaDeFuncionarios[1] = arq;
        listaDeFuncionarios[2] = prof;
        listaDeFuncionarios[3] = fun;


        for (Funcionario funcionario: listaDeFuncionarios) {
            if(funcionario != null){
                funcionario.mostraInfo();
                funcionario.executaAcao();

                if (funcionario instanceof Professor){

                    // Casting com variavel auxiliar
                    Professor aux = (Professor) funcionario;
                    aux.corrigirProvas();

                    // Sem variavel auxiliar
                    ((Professor) funcionario).corrigirProvas();
                }
            }
        }

    }
}