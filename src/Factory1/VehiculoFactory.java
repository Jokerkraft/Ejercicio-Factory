package Factory1;

// Fábrica de vehículos utilizando el patrón Factory Method
public class VehiculoFactory {
    // Método estático para crear vehículos según el tipo especificado
    public static Vehiculo crearVehiculo(TipoVehiculo tipo, String... parametros) {
        // Utilizamos un switch para determinar qué tipo de vehículo crear
        switch (tipo) {
            case COCHE:
                // Si se proporcionan al menos dos parámetros, los usamos para crear el coche
                if (parametros.length >= 2) {
                    return new Coche(parametros[0], parametros[1]);
                    // Si no se proporcionan suficientes parámetros, creamos un coche con valores por defecto
                } else {
                    return new Coche("Toyota", "Corolla");
                }

                // Si el tipo de vehículo es motocicleta, verificamos si se proporcionan los parámetros necesarios
            case MOTOCICLETA:
                if (parametros.length >= 2) {
                    // Intentamos convertir el segundo parámetro a un entero para la cilindrada
                    try {
                        int cilindrada = Integer.parseInt(parametros[1]);
                        return new Motocicleta(parametros[0], cilindrada);
                        // Si la conversión falla, creamos una motocicleta con una cilindrada por defecto
                    } catch (NumberFormatException e) {
                        return new Motocicleta(parametros[0], 250);
                    }
                    // Si no se proporcionan suficientes parámetros, creamos una motocicleta con valores por defecto
                } else {
                    return new Motocicleta("Yamaha", 250);
                }

                // Si el tipo de vehículo es camión, verificamos si se proporcionan los parámetros necesarios
            case CAMION:
                // Intentamos convertir el segundo parámetro a un número de punto flotante para la capacidad de carga
                if (parametros.length >= 2) {
                    // Si la conversión falla, creamos un camión con una capacidad de carga por defecto
                    try {
                        double capacidad = Double.parseDouble(parametros[1]);
                        return new Camion(parametros[0], capacidad);
                        // Si la conversión falla, creamos un camión con una capacidad de carga por defecto
                    } catch (NumberFormatException e) {
                        return new Camion(parametros[0], 10.0);
                    }
                    // Si no se proporcionan suficientes parámetros, creamos un camión con valores por defecto
                } else {
                    return new Camion("Volvo", 15.0);
                }

                // Si el tipo de vehículo no es reconocido, lanzamos una excepción
            default:
                throw new IllegalArgumentException("Tipo de vehículo no soportado: " + tipo);
        }
    }

    // Método adicional para crear un vehículo con valores por defecto según el tipo especificado
    public static Vehiculo crearVehiculoPorDefecto(TipoVehiculo tipo) {
        return crearVehiculo(tipo);
    }
}
