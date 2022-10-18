import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cadastro {

//    Criação da lista
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void create(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

//    Leitura de um objeto específico na lista
    public Funcionario read(Funcionario funcionario){
        int index = funcionarios.indexOf(funcionario);
        return funcionarios.get(index);
    }

//    Leitura do Index de um objeto específico na lista
    public int readIndex(Funcionario funcionario){
        return  funcionarios.indexOf(funcionario);
    }
//    Leitura de todos os objetos da lista, precisa que a classe utilizada na lista implemente o método toString()
    public void readAll(){
        System.out.println(funcionarios);
    }

//    Ordenação de todos os objetos da lista, precisa que a classe utilizada na lista implemente o método compareTo() da interface Comparable
    public void ordena(){
        Collections.sort(funcionarios);
    }

}
