package Factory1;

// Clase Factory1.Bicicleta que implementa la interfaz Vehciulo
public class Bicicleta implements Vehiculo {
    private String tipo;
    private int numVelocidades;

    // Constructor para inicializar la bicicleta con su tipo y número de velocidades
    public Bicicleta(String tipo, int numVelocidades) {
        this.tipo = tipo;
        this.numVelocidades = numVelocidades;
    }

    // Implementación del método acelerar de la interfaz Factory1.Vehiculo
    @Override
    public void acelerar() {
        System.out.println("La bicicleta " + tipo + " está siendo pedaleada");
    }

    // Implementación del método frenar de la interfaz Factory1.Vehiculo
    @Override
    public void frenar() {
        System.out.println("La bicicleta está frenando con frenos de mano");
    }

    // Implementación del método mostrarInfo de la interfaz Factory1.Vehiculo
    @Override
    public void mostrarInfo() {
        System.out.println("🚲 Factory1.Bicicleta: " + tipo + " - " + numVelocidades + " velocidades, ecológica");
    }
}
