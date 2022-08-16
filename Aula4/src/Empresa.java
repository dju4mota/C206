public class Empresa {

    String cnpj;
    String endereco;
    Contato[] contatos;

    // Construtor com parâmetros
    Empresa(String cnpj, String endereco ) {
        this.cnpj = cnpj;
        this.endereco = endereco;
//        Composição
        this.contatos = new Contato[5];
    }

    // Construtor sem parâmetros
    Empresa(){
//        Composição
        this.contatos = new Contato[5];
    }

    void exibirInfos(){
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Endereço: " + this.endereco);

        for (Contato contato : contatos) {
            if (contato != null) {
                System.out.println(contato.nome + " - " + contato.email + " - " + contato.telefone + " - " + contato.dataNascimento);
            }
        }

    }

}
