package Factory2;

// Clase principal para demostrar el uso del patrón de diseño Factory Method
public class Main {
    public static void main(String[] args) {
        // Creamos una fábrica para coches tipo sedan y ensamblamos un coche sedan
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.assemble();

        // Creamos una fábrica para coches tipo SUV y ensamblamos un coche SUV
        CarFactory suvFactory = new SUVFactory();
        Car suv = suvFactory.createCar();
        suv.assemble();
    }
}
