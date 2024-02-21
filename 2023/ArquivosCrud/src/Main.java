import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ManipuladorDeArquivos manipuladorDeArquivos = new ManipuladorDeArquivos();

        manipuladorDeArquivos.createJogo(new Jogo(250, "Zelda", 1));
        manipuladorDeArquivos.createJogo(new Jogo(350, "Mario", 2));
        manipuladorDeArquivos.createJogo(new Jogo(150, "Sonic", 3));

        manipuladorDeArquivos.readJogos();
        manipuladorDeArquivos.readJogo("2");

        manipuladorDeArquivos.updateJogo(2, new Jogo(200, "Mario", 4));
    }
}
