package Factory1;

// Clase concreta que implementa la interfaz Vehciulo
public class Motocicleta implements Vehiculo {
    private String marca;
    private int cilindrada;

    // Constructor para inicializar la motocicleta con su marca y cilindrada
    public Motocicleta(String marca, int cilindrada) {
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    // Implementación del método acelerar de la interfaz Factory1.Vehiculo
    @Override
    public void acelerar() {
        System.out.println("La motocicleta " + marca + " está acelerando con " + cilindrada + "cc");
    }

    // Implementación del método frenar de la interfaz Factory1.Vehiculo
    @Override
    public void frenar() {
        System.out.println("La motocicleta está frenando con precaución");
    }

    // Implementación del método mostrarInfo de la interfaz Factory1.Vehiculo
    @Override
    public void mostrarInfo() {
        System.out.println("🏍️ Factory1.Motocicleta: " + marca + " " + cilindrada + "cc - 2 ruedas, ágil y rápida");
    }
}