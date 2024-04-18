public class BracoArticulado extends Robo{
    private int numeroDeArticulado;
    private Garra garra;
    private Camera camera;


    @Override
    public void trabalhar() {
        if(camera != null){
            garra.agarrarPeca(camera.acharPecas());
        } else {
            garra.agarrarPeca();
        }
    }

    public BracoArticulado(int energia, int energiaMaxima, String nome, int numeroDeArticulado) {
        super(energia, energiaMaxima, nome);
        this.numeroDeArticulado = numeroDeArticulado;
        this.garra = new Garra();
    }

    public BracoArticulado(int energia, int energiaMaxima, String nome, int numeroDeArticulado, Camera camera) {
        super(energia, energiaMaxima, nome);
        this.numeroDeArticulado = numeroDeArticulado;
        this.garra = new Garra();
        this.camera = camera;
    }

    @Override
    public String toString() {

        return  super.toString() +
                "BracoArticulado{" +
                "numeroDeArticulado=" + numeroDeArticulado +
                ", garra=" + garra +
                ", camera=" + camera +
                '}';
    }
}
