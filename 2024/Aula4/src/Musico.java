import java.util.Arrays;

public class Musico {

    private  String nome;
    private Album[] albums = new Album[10];

    public void adicionar(Album album){
        for (int i = 0; i < albums.length; i++) {
            if(albums[i] == null){
                albums[i] = album;
                break;
            }
        }
    }

    public void listar(){
        for (Album album : albums) {
            if (album != null) {
                System.out.println(album.getNome());
                System.out.println(album.getNota());
            }
        }
    }

    public void deletar(int posicao){
        albums[posicao] = null;
    }

    public Album buscar(String nome){
        for (Album album : albums) {
            if (album != null) {
                if (album.getNome() == nome) {
                    return album;
                }
            }
        }
        return null;
    }



}
