package Factory1;

// Demostración del patrón Factory para la creación de vehículos
public class FactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DEL PATRÓN FACTORY ===\n");

        // Creación de vehículos utilizando la fábrica
        Vehiculo coche1 = VehiculoFactory.crearVehiculo(TipoVehiculo.COCHE, "Honda", "Civic");
        Vehiculo moto1 = VehiculoFactory.crearVehiculo(TipoVehiculo.MOTOCICLETA, "Kawasaki", "600");
        Vehiculo camion1 = VehiculoFactory.crearVehiculo(TipoVehiculo.CAMION, "Mercedes", "12.5");

        // Creación de vehículos utilizando el método de fábrica con valores por defecto
        Vehiculo coche2 = VehiculoFactory.crearVehiculoPorDefecto(TipoVehiculo.COCHE);
        Vehiculo moto2 = VehiculoFactory.crearVehiculoPorDefecto(TipoVehiculo.MOTOCICLETA);

        // Almacenamos los vehículos en un arreglo para facilitar su manejo
        Vehiculo[] vehiculos = {coche1, moto1, camion1, coche2, moto2};

        // Mostramos la información de cada vehículo, aceleramos y frenamos para demostrar su funcionalidad
        System.out.println("1. INFORMACIÓN DE VEHÍCULOS:");
        System.out.println("----------------------------");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInfo();
        }

        // Aceleramos todos los vehículos para demostrar su comportamiento específico según su tipo
        System.out.println("\n2. ACELERANDO TODOS LOS VEHÍCULOS:");
        System.out.println("----------------------------------");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar();
        }

        // Frenamos todos los vehículos para demostrar su comportamiento específico según su tipo
        System.out.println("\n3. FRENANDO TODOS LOS VEHÍCULOS:");
        System.out.println("--------------------------------");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.frenar();
        }

        // Demostración de creación dinámica de vehículos basada en input (simulado con un arreglo de strings)
        System.out.println("\n4. CREACIÓN DINÁMICA BASADA EN INPUT:");
        System.out.println("-------------------------------------");

        // Simulamos la entrada de tipos de vehículos como strings, que podrían provenir de un usuario o una fuente externa
        String[] tiposInput = {"COCHE", "MOTOCICLETA", "CAMION"};

        // Intentamos crear vehículos dinámicamente a partir de los tipos especificados en el input
        for (String tipoStr : tiposInput) {
            // Convertimos el string a un valor del enum Factory1.TipoVehiculo y creamos un vehículo por defecto de ese tipo
            try {
                TipoVehiculo tipo = TipoVehiculo.valueOf(tipoStr);
                Vehiculo vehiculo = VehiculoFactory.crearVehiculoPorDefecto(tipo);
                System.out.print("Creado dinámicamente: ");
                vehiculo.mostrarInfo();
                // Lanzamos una excepción si el tipo de vehículo no es válido
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de vehículo no válido: " + tipoStr);
            }
        }

        // Fin de la demostración
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
