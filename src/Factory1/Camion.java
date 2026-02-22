package Factory1;

// Clase concreta que implementa la interfaz Vehciulo
public class Camion implements Vehiculo {
    private String marca;
    private double capacidadCarga;

    // Constructor para inicializar el camión con su marca y capacidad de carga
    public Camion(String marca, double capacidadCarga) {
        this.marca = marca;
        this.capacidadCarga = capacidadCarga;
    }

    // Implementación del método acelerar de la interfaz Factory1.Vehiculo
    @Override
    public void acelerar() {
        System.out.println("El camión " + marca + " está acelerando lentamente con " + capacidadCarga + " toneladas");
    }

    // Implementación del método frenar de la interfaz Factory1.Vehiculo
    @Override
    public void frenar() {
        System.out.println("El camión está frenando con sistema de frenos neumático");
    }

    // Implementación del método mostrarInfo de la interfaz Factory1.Vehiculo
    @Override
    public void mostrarInfo() {
        System.out.println("🚛 Camión: " + marca + " - Capacidad: " + capacidadCarga + " toneladas");
    }
}
