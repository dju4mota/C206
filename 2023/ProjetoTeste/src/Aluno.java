import java.util.Scanner;

public class Aluno {
    int np1;

    int np2;

    int calculaMedia() {
        int media = (np1 + np2) / 2;

        System.out.println("media = " + media);
        if (media < 60) {

            System.out.println("recuperação");
            calculaNP3(media);
        }
        return media;
    }

    int calculaNP3(int media) {
        Scanner scan = new Scanner(System.in);
        int np3 = scan.nextInt();
        if ((np3 + media) / 2 >= 60) {
            System.out.println("passou");
        }
        return np3;
    }
}
