public class Restaurante {

//    Atributos (variáveis)
    String cnpj;
    String endereco;
    String nome;
    Fornecedor[] fornecedores;

    // Construtor com parâmetros
    Restaurante(String cnpj, String endereco, String nome) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
//        Composição
        this.fornecedores = new Fornecedor[5];
    }

    void exibirInfos(){
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Nome: " + this.nome);
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor != null) {
                System.out.println(fornecedor.tipo + " - " + fornecedor.quantidade);
            }
        }
    }
}
