public class Contato {

//    Atributos (variáveis)
    String nome;
    String email;
    String telefone;
    String dataNascimento;

//    Construtor sem parâmetros
    Contato(){};

//    Construtor com parâmetros
    Contato(String nome, String email, String telefone, String dataNascimento){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
}
