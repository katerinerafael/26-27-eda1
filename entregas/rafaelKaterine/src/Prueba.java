public class Prueba {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertarAlPrincipio(1);
        lista.insertarAlPrincipio(1);
        lista.insertarAlPrincipio(2);
        lista.insertarAlPrincipio(3);
        lista.insertarAlPrincipio(3);
        lista.imprimirLista();
        lista.eliminarRepetidos();
        lista.imprimirLista();
    }
}