import java.util.Random;

public class Main {

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }

    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo(120);
        Fila fila = new Fila();
        Caja caja = new Caja();
        Random random = new Random();

        int contadorPersonas = 1;

        while (tiempo.trabajando()) {
            tiempo.avanzarMinuto();
            int minActual = tiempo.mostrarMinutoActual();

            limpiarPantalla();

            System.out.println("=== SIMULACIÓN CARREFOUR (2 HORAS) ===");
            System.out.print("Minuto " + minActual + " -> ");

            if (random.nextDouble() < 0.60) {
                Persona nueva = new Persona(minActual, contadorPersonas++);
                fila.agregarPersona(nueva);
            }

            if (caja.estaDisponible()) {
                fila.atender();
            }

            if (tiempo.reglasNuevasActivas()) {
                
                fila.revisarAburrimiento(minActual);

                if (random.nextDouble() < 0.10) {
                    fila.colarse(new Persona(minActual, contadorPersonas++));
                }

                if (random.nextDouble() < 0.05) {
                    fila.transferirCompras();
                }

                if (tiempo.esTiempoDeParlante() && fila.getTamaño() > 25) {
                    System.out.print("[Parlantes: Pasen por esta caja] ");
                    fila.atender();
                }
            }

            fila.mostrarEstado();

            try {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}