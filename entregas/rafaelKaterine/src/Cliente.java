public class Cliente {

    private int packDeItems;
    private boolean esPreferencial;

    public Cliente(int id, int compraMinima, int compraMaxima) {
        this.packDeItems = (int) (Math.random() * (compraMaxima - compraMinima + 1) + compraMinima);
        this.minutoLlegada = minutoLlegada;
        this.esPreferencial = Math.random() < 0.35; 
    }

    public void entregaProducto() {
        packDeItems--;
    }

    public boolean tieneProductos() {
        return packDeItems > 0;
    }

    public boolean esPreferencial() {
        return esPreferencial;
    }

    public void mostrar() {
        System.out.println("Cliente [" packDeItems=" + packDeItems + ", esPreferencial=" + esPreferencial + "]");
    }

}