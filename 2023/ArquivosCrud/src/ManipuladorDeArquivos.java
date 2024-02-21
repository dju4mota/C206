import java.io.*;
import java.util.Arrays;

public class ManipuladorDeArquivos {

    public BufferedWriter criaObjetosSaida(boolean append) throws FileNotFoundException {
        OutputStream fluxoSaida = new FileOutputStream("scratch.txt", append);
        OutputStreamWriter geradorFluxoSaida  = new OutputStreamWriter(fluxoSaida);
        return new BufferedWriter(geradorFluxoSaida);
    }
    public void fechaObjetos(BufferedWriter bufferSaida) throws IOException {
        assert bufferSaida != null;
        bufferSaida.close();
    }
    public void fechaObjetos(BufferedReader bufferEntrada) throws IOException {
        assert bufferEntrada != null;
        bufferEntrada.close();
    }
    public BufferedReader criaObjetosEntrada() throws FileNotFoundException {
       FileInputStream fluxoEntrada = new FileInputStream("scratch.txt");
        InputStreamReader geradorFluxoEntrada = new InputStreamReader(fluxoEntrada);
        return new BufferedReader(geradorFluxoEntrada);
    }



    public void createJogo(Jogo jogo)  {
        try {
            BufferedWriter buffer = criaObjetosSaida(true);
            buffer.write("Jogo { ID: " + jogo.getId() + " nome: " + jogo.getNome() + " preco: " + jogo.getPreco() +" }");
            buffer.newLine();
            fechaObjetos(buffer);
        } catch (Exception e){ System.err.printf(String.valueOf(e)); }
        finally {
            System.out.println("finalizado");
        }
    }

    public void readJogo(String id){
        try {

            BufferedReader buffer = criaObjetosEntrada();
            String leitura  = buffer.readLine();
            while (leitura != null){

                String aux = leitura.substring(leitura.indexOf("ID:"), leitura.indexOf("nome:"));

                if(aux.equals("ID: " + id + " ")) {
                    System.out.println(leitura);
                }
                leitura  = buffer.readLine();
            }
            fechaObjetos(buffer);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void readJogos(){
        try {
            BufferedReader buffer = criaObjetosEntrada();
            String leitura  = buffer.readLine();
            while (leitura != null){
                System.out.println(leitura);
                leitura  = buffer.readLine();
            }
            fechaObjetos(buffer);
        }catch (Exception e){ }
    }

    public String[] readJogosAsList(){
        String[] lista = new String[20];
        int cont = 0;
        try {
            BufferedReader buffer = criaObjetosEntrada();
            String leitura  = buffer.readLine();
            while (leitura != null){

                lista[cont] = leitura;

                leitura  = buffer.readLine();
                cont++;
            }
            fechaObjetos(buffer);
        }catch (Exception e){  }
        return lista;
    }

    public void updateJogo(int id, Jogo jogo){
        String[] lista = readJogosAsList();
        for (int i= 0; i < 20; i++) {

            if(lista[i] != null){
                String aux = lista[i].substring(lista[i].indexOf("ID:"), lista[i].indexOf("nome:"));
                if(aux.equals("ID: " + id + " ")) {
                    lista[i] = jogo.toString();
                }
            }
        }
        System.out.println(Arrays.toString(lista));

    }

    public void deleteJogo(){

    }


}
