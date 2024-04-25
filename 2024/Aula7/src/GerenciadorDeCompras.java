public class GerenciadorDeCompras {
    private Item[] listaDeCompras = new Item[10];

    public GerenciadorDeCompras(Item[] listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }

    public void add(Item item, int pos) {
        listaDeCompras[pos] = item;
    }


    public void add(Item item){
        for (int i = 0; i < listaDeCompras.length; i++) {
            if(listaDeCompras[i] == null){
                listaDeCompras[i] = item;
                break;
            }
        }
    }

    public void calcular() throws  Exception{
        float total = 0f;

        for (Item listaDeCompra : listaDeCompras) {
            if (listaDeCompra != null)
                total += listaDeCompra.getValor();
        }
    }


}
