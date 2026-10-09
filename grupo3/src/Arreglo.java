class Arreglo {
    private int longitud;
    private ListaEnlazada lista;

    public Arreglo(int longitud){
        this.longitud = longitud;
        crearArreglo(longitud);
    }

    public void agregarElemento(){
        lista.inserta
    }

    private void crearArreglo(int tamaño){
        lista = new ListaEnlazada();
        for(int i = 0; i <= tamaño; i++){
            lista.insertarAlPrincipio(0);
        }
    }
}