import java.io.*;

public class Main {
    public static void main(String[] args) {
        OutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;

        InputStream fluxoEntrada = null;
        InputStreamReader geradorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;

        try {
            fluxoSaida = new FileOutputStream("scratch.txt",true);
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);
            bufferSaida.write("POO!");
            bufferSaida.newLine();

            fluxoEntrada = new FileInputStream("scratch.txt");
            geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(geradorFluxoEntrada);

            String leitura  = bufferEntrada.readLine();
            System.out.println(leitura);

//            StringBuilder textoLido = new StringBuilder();
//
//            while(bufferEntrada.ready()){
//                textoLido.append(bufferEntrada.readLine() + "\n");
//            }

//            System.out.println(textoLido.toString().replace("Hello, World!", "!"));

        }catch (Exception e){
            System.out.println(e);
        } finally {
            try {
                bufferSaida.close();
                System.out.println("Sistema Encerrado");
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
}