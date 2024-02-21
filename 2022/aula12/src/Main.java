import java.io.*;

public class Main {
    public static void main(String[] args) {

        // Objetos para saída de dados
        OutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;

        // Objetos para entrada de dados
        InputStream fluxoEntrada = null;
        InputStreamReader geradorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;

//        Colocamos essa parte dentro do try-catch para lidar com as exceções de arquivos
        try {
            for(int i =0; i <2; i++) {
//            Inicializando os objetos
                    fluxoSaida = new FileOutputStream("scratch.txt", true);
                    geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
                    bufferSaida = new BufferedWriter(geradorFluxoSaida);

//            Escrita no arquivo
                bufferSaida.write("POO!");
                bufferSaida.newLine();
                bufferSaida.write("POO!");
                bufferSaida.newLine();
            }
//            Inicializando os objetos
            fluxoEntrada = new FileInputStream("scratch.txt");
            geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(geradorFluxoEntrada);


//           Leitura no arquivo
            String leitura  = bufferEntrada.readLine();
            System.out.println(leitura);

        }catch (Exception e){
            System.err.printf(String.valueOf(e));
        } finally {
//            bloco finally para fechar o buffer independente se teve exception ou não
            try {
                assert bufferSaida != null;
                bufferSaida.close();
                assert bufferEntrada != null;
                bufferEntrada.close();
                System.out.println("Sistema Encerrado");
            } catch (IOException e) {
                System.err.printf(String.valueOf(e));
            }
        }

    }
}