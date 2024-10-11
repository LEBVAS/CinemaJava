package cinemajava.Objectos;

public class Asientos {

    // Matriz de asientos para el cine
    private String[][] asientos = {
        {"8A", "8B", "8C", "8D", "8E", "8F", "8G", "8H", "8I"},
        {"7A", "7B", "7C", "7D", "7E", "7F", "7G", "7H", "7I"},
        {"6A", "6B", "6C", "6D", "6E", "6F", "6G", "6H", "6I"},
        {"5A", "5B", "5C", "5D", "5E", "5F", "5G", "5H", "5I"},
        {"4A", "4B", "4C", "4D", "4E", "4F", "4G", "4H", "4I"},
        {"3A", "3B", "3C", "3D", "3E", "3F", "3G", "3H", "3I"},
        {"2A", "2B", "2C", "2D", "2E", "2F", "2G", "2H", "2I"},
        {"1A", "1B", "1C", "1D", "1E", "1F", "1G", "1H", "1I"}
    };

    // Método para mostrar los asientos disponibles
    public void mostrarAsientos() {
        System.out.println(":::::: MATRIZ DE ASIENTOS ::::::");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {

                // Mostrar asientos separados por comillas dobles
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }

    // Método para ocupar un asiento
    public void ocuparAsiento(String asiento) {
        boolean encontrado = false;

        // Recorremos la matriz para buscar el asiento
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j].equals(asiento)) {  // Si esta libre 🚫
                    asientos[i][j] = "🚫"; // Marcar asiento como ocupado
                    encontrado = true;
                    System.out.println("El asiento " + asiento
                            + " a sido marcado como ocupado.");
                    break;
                }
            }
            if (encontrado) {
                break; // Salir del bucle si ya ocupamos el asiento
            }
        }

        // ! diferente a encontrado
        if (!encontrado) {
            System.out.println("Asiento no encontrado o ya ocupado.");
        }
    }

    // Método para comprobar si un asiento está ocupado
    public boolean estaOcupado(String asiento) {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j].equals(asiento)) {
                    return false; // Asiento está disponible
                }
            }
        }
        return true; // Asiento si está ocupado
    }
}
