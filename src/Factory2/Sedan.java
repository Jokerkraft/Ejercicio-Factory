package Factory2;

// Clase concreta que implementa la interfaz Car para un coche tipo sedan
public class Sedan implements Car{

    // Implementación del método assemble para el coche tipo sedan
    @Override
    public void assemble() {
        System.out.println("Assembling a sedan car.");
    }
}
