public enum Ordenacao {

    CRESCENTE(1),
    DESCRESCENTE(2),
    ALFABETICA(3);

    private int num;

    Ordenacao(int ordenacao){
        this.num = ordenacao;
    }

    public int getNum() {
        return num;
    }
}
