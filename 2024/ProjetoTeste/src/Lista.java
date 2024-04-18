import  java.util.Arrays;
import java.util.Scanner;

public class Lista {


    public void teste(){
        int[] array1;
        array1 = new int[]{0, 1};
        int[] array2 = {1,2,3,5};
        int[] array3 = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println((Arrays.toString(array1)));
        //[0, 1]

        System.out.println(Arrays.toString(array2));
        // [1, 2, 3, 5]

        System.out.println(Arrays.toString(array3));
        // [0, 0, 0, 0, 0]


        // Criação do array de objetos
        Jogador[] array = new Jogador[10];
        // Criação do Objeto
        Jogador p1 = new Jogador();
        // Colocando o objeto dentro do array
        array[0] = p1;
        // Criando o Objeto já dentro do array
        array[1] = new Jogador();

        System.out.println(Arrays.toString(array));
        // [Jogador@6d03e736, Jogador@568db2f2, null,
        // null, null, null, null, null, null, null]

        int[] array4 = {10,20,30,40,50,60,70};

        for(int i= 0; i < array4.length; i++){
            System.out.println(array4[i]);
        }

        for (int valor :array4){
            System.out.println(valor);
        }

        for (int i = 0; i <array.length; i++){
            System.out.println(array[i]);
        }

        for (Jogador player: array){
            System.out.println(player);
        }

        for (Jogador player: array){
            System.out.println(player.energia);
        }

        for (Jogador player: array){
            if(player != null){
                System.out.println(player.energia);
            }
        }

    }


}
