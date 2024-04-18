//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BracoArticulado ba = new BracoArticulado(7,10,"Bracinho",4);
        BracoArticulado ba2 = new BracoArticulado(7,10,"Staubli",5, new Camera());
        Empilhador emp = new Empilhador(7,10,"Bracinho",8);

        ba.trabalhar();
        ba2.trabalhar();

        ba.trocarEnergia(ba2);
        ba.recarregar(2);

        emp.trabalhar();
        emp.adicionarPacote(1);
        emp.adicionarPacote(3);
        emp.adicionarPacote(5);
        emp.adicionarPacote(10);

        emp.mostraPacote();
        emp.removePacote(1);
        emp.mostraPacote();

        System.out.println(emp);
        System.out.println(ba);
        System.out.println(ba2);

    }
}
