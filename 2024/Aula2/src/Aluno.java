import java.util.Scanner;

public class Aluno {

    public int matricula;
    public int np1;
    public int np2;
    public int periodo;
    public String nome;

    public int calculaMedia(){
        int media = (this.np1+np2)/2;
        if (media >=60){
            System.out.println("Aprovado");
        }else if (media >=30){
            return calculaNP3(media);
        } else{
            System.out.println("reprovado");
        }
        return media;
    }

    public int calculaNP3(int media){
        Scanner scan = new Scanner(System.in);
        System.out.println("Np3: ");
        int np3 = scan.nextInt();
        media = (media+np3)/2;
        if(media>= 50){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", np1=" + np1 +
                ", np2=" + np2 +
                ", periodo=" + periodo +
                ", nome='" + nome + '\'' +
                '}';
    }


}
