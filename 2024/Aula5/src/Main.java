import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Engenheiro eng = new Engenheiro("dju", "soft");
        //Profissao prof = new Profissao("joao");
        Profesor profesor = new Profesor("maria");
        profesor.trabalhar(10);
        System.out.println(eng.calcularSalario(10));
        //System.out.println(prof.calcularSalario(10));
        System.out.println(profesor.calcularSalario(10));

        System.out.println((int) ((Math.random() * 9) + 1));

        aaa(eng);
    }

    static void aaa(Profissao p){
        p.trabalhar(10);
    }
}