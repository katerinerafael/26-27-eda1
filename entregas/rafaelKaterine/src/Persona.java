import java.util.Random;

public class Persona {

    public boolean esPreferencial;
    public int minutoDeLlegada;
    private static final Random random = new Random();

    public Persona(int minutoDeLlegada) {
        this.esPreferencial = random.nextBoolean() < 0.15;
        this.minutoDeLlegada = minutoDeLlegada;
    } 

    public boolean seAburre (int minutoActual) {
        int tiempoDeEspera = minutoActual - minutoDeLlegada;
        if (tiempoDeEspera >= 8 && minutoActual % 5 == 0){
            return random.nextBoolean() < 0.30;
        }
        return false;
    }

    public String perfil() {
        return esPreferencial ? "🏥" : "👤";
    }




}