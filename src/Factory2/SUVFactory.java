package Factory2;

// Clase concreta que implementa la interfaz CarFactory para crear coches tipo SUV
public class SUVFactory implements CarFactory{

    // Implementación del método createCar para crear un coche tipo SUV
    @Override
    public Car createCar() {
        return new SUV();
    }
}
