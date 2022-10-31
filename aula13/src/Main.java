public class Main {
    public static void main(String[] args) {

        Thread tTempo = new ThreadTempo(10);
        Thread tMusica = new ThreadMusica();
        ThreadFatorial threadFatorial = new ThreadFatorial(300);

        threadFatorial.start();
        tTempo.start();
        tMusica.start();

    }
}