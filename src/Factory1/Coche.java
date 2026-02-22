package Factory1;

// Clase Coche que implementa la interfaz Vehiculo
public class Coche implements Vehiculo {
    private String marca;
    private String modelo;

    // Constructor para inicializar el coche con su marca y modelo
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Implementación del método acelerar de la interfaz Vehiculo
    @Override
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando por la carretera");
    }

    // Implementación del método frenar de la interfaz Vehiculo
    @Override
    public void frenar() {
        System.out.println("El coche está frenando con frenos de disco");
    }

    // Implementación del método mostrarInfo de la interfaz Vehiculo
    @Override
    public void mostrarInfo() {
        System.out.println("🚗 Factory1.Coche: " + marca + " " + modelo + " - 4 ruedas, motor a gasolina");
    }
}
