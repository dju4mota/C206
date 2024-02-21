public abstract class  Profissao {
     String nome;
     int idade;
      double salario;


      public abstract String trabalhar();

    @Override
    public String toString() {
        return nome + " " + idade + " " + salario;
    }

    public Profissao(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }


    public double calculaSalario(){
        return salario;
    }

}
