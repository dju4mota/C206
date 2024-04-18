import java.util.Arrays;

public class Autor {
    private String nome;
    private Saga[] sagas;

    public Autor(String nome) {
        this.nome = nome;
        sagas = new Saga[5];
    }

    public void listarSagas(){
        for (Saga saga : sagas) {
            if (saga != null) {
                System.out.println("Nome " + saga.getNome());
                System.out.println("Nota " + saga.getNota());
                saga.listarLivros();
                System.out.println(Arrays.toString(sagas));

                // ou
                // Caso tenha implementado o toString na classe Saga pode só printar o objeto direto
                // System.out.println(saga);
                //saga.listarLivros();
            }
        }
    }

    public void adicionarSaga(Saga saga){
        for (int i = 0; i < sagas.length; i++) {
            if(sagas[i] == null){
                sagas[i] = saga;
                break;
            }
        }
    }

    public Saga[] getSagas() {
        return sagas;
    }
}

