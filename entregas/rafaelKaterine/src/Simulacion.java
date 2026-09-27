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

        boolean hayPrimero = primero.haySiguiente();
        if (hayPrimero) {
            primero = primero.devolverSiguiente();
            System.out.println("El nuevo primero es: " + primero.getNombre());
        }
    }
}