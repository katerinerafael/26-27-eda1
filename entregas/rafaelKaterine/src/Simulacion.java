public class Simulacion { 

    public static void main(String[] args) {
        Persona jacobo = new Persona("Jacobo");
        Persona hector = new Persona("Héctor");
        Persona hugo = new Persona("Hugo");
        Persona maikol = new Persona("Maikol");
        Persona luisFelipe = new Persona("Luis Felipe");

        Persona primero = jacobo;
        primero.encolar(hector);
        primero.encolar(hugo);
        primero.encolar(maikol);
        primero.encolar(luisFelipe);

        System.out.println("Pruebas");
        System.out.println("Cola inicial: " + primero.mostrar());
        System.out.println("Total personas: " + primero.contar());
        System.out.println("Al revés: " + primero.mostrarAlReves());
        
        Persona buscado = primero.buscar("Hugo");
        System.out.println("Buscado Hugo: " + (buscado != null ? buscado.getNombre() : "No está"));

        System.out.println("Simulacion de atención a la cola:");
        int turno = 1;
        while (primero != null) {
            System.out.println("Turno " + turno + ": Atendiendo a " + primero.getNombre());
            
            if (primero.haySiguiente()) {
                primero = primero.devolverSiguiente();
            } else {
                primero = null; 
            }
            turno++;
        }
        System.out.println("¡La cola ha quedado completamente vacía!");
    }
}