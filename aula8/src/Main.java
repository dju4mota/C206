public class Main {
    public static void main(String[] args) {


        Funcionario eng = new Engenheiro("Joao", 25, 5000,"Software");
        Funcionario arq = new Arquiteto("Lucas", 32, 8000,"Restaurantes");
        Funcionario prof = new Professor("Pedro", 37, 4500,"Matemática");
//        Funcionario funf = new Funcionario("Gabriel", 23 , 3700);


        eng.mostraInfo();
        arq.mostraInfo();
        arq.executaAcao();
        prof.mostraInfo();
        ((Engenheiro) eng).gerenciar();

        if (prof instanceof Professor){

            ((Professor) prof).corrigirProvas();

            Professor profConvertido = (Professor) prof;
            profConvertido.corrigirProvas();
        }



    }
}