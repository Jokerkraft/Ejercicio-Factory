package Factory2;

// Clase concreta que implementa la interfaz Car para un coche tipo SUV
public class SUV implements Car{

    // Implementación del método assemble para el coche tipo SUV
    @Override
    public void assemble() {
        System.out.println("Assembling an SUV car.");
    }
}
