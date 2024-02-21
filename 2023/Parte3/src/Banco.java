public class Banco {
    float saldo;

    public float getSaldo(){

        if(saldo>=0)
            return saldo;
        else
            throw new RuntimeException();

    }

}
