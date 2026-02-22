package Factory2;

// Clase concreta que implementa la interfaz CarFactory para crear coches tipo sedan
public class SedanFactory implements CarFactory{

    // Implementación del método createCar para crear un coche tipo sedan
    @Override
    public Car createCar() {
        return new Sedan();
    }
}
