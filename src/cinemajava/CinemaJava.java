
package cinemajava;

import cinemajava.Objectos.Asientos;
import cinemajava.Objectos.Espectador;
import cinemajava.Objectos.Pelicula;
import cinemajava.Objectos.PrecioEntrada;
import java.util.Scanner;

public class CinemaJava {

    // Definir atributos
    private Pelicula pelicula;
    private Asientos asientos;
    private Espectador espectador;
    private PrecioEntrada precioEntrada;

    // Crear constructor con parámetros
    public CinemaJava(Pelicula pelicula, Asientos asientos,
            Espectador espectador, PrecioEntrada precioEntrada) {
        this.pelicula = pelicula;
        this.asientos = asientos;
        this.espectador = espectador;
        this.precioEntrada = precioEntrada;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar información de la película
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println("      ¡ PELÍCULAS DISPONIBLES !");
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println("Nombre de la película : Harry Potter");
        System.out.println("Duración de la película : 180 min");
        System.out.println("Director de la película : Chris Columbus");
        System.out.println("Edad mínima : +12");

        System.out.println("Quiere ingresar a la sala de cine? (si - no)");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "si":

                // Comprobamos la edad
                // Para mirar si cumple con la edad minima de la pelicula
                // O no cumple con la edad minima
                System.out.println("¿Qué edad tienes actualmente?");
                int edad = scanner.nextInt();
                scanner.nextLine(); // Para que no se repita el mensaje

                if (edad < 12) {
                    System.out.println("Lo siento, "
                            + "no eres apto para ver esta película.");
                    return; // Termina la ejecución si no cumple con la edad
                } else {
                    System.out.println("Excelente, "
                            + "eres apto para ver esta película.");
                }

                // Crear un scanner para comprobar dinero disponible
                System.out.println("¿Cuánto dinero tienes?");
                int dinero = scanner.nextInt();
                scanner.nextLine(); // Para que no se repita el mensaje

                PrecioEntrada precioEntrada = new PrecioEntrada();
                System.out.println("El precio de la entrada es: "
                        + precioEntrada.getPrecioEntrada());

                if (dinero >= precioEntrada.getPrecioEntrada()) {
                    System.out.println("¡Puedes ver la película! Disfrútala.");
                } else {
                    System.out.println("Lo siento,"
                            + " no te alcanza el dinero para la entrada.");
                    return; // Termina la ejecución si no tiene suficiente dinero
                }

                // Inicializar los asientos
                Asientos asientos = new Asientos();
                asientos.mostrarAsientos();

                // Seleccionar asiento
                System.out.println("Seleciona un asiento disponible:");
                String asientoElegido = scanner.next();
                scanner.nextLine(); // Para que no se repita el mensaje

                // Marcar asiento como ocupado
                asientos.ocuparAsiento(asientoElegido);
                // Mostrar el asiento despues de la reserva
                System.out.println("Asiento "
                        + asientoElegido + " reservado con éxito.");
                asientos.mostrarAsientos();

                // Preguntar si quiere otro boleto
                System.out.println("¿Quiere comprar otro boleto? (si - no)");
                String opcion_2 = scanner.nextLine();
                // Para que no se repita el mensaje

                while (opcion_2.equals("si")) {

                    // Comprobamos el dinero para otro boleto
                    System.out.println("¿Cuánto dinero tienes?");
                    dinero = scanner.nextInt();
                    // Para que no se repita el mensaje

                    System.out.println("El precio de la entrada es: "
                            + precioEntrada.getPrecioEntrada());

                    if (dinero >= precioEntrada.getPrecioEntrada()) {
                        System.out.println("¡Puedes ver la película!"
                                + " Disfrútala.");
                    } else {
                        System.out.println("Lo siento,"
                                + " no te alcanza el dinero para la entrada.");
                        return;
                    }

                    // Mostrar asientos disponibles
                    asientos.mostrarAsientos();

                    // Seleccionar asiento
                    System.out.println("Elige un asiento disponible:");
                    asientoElegido = scanner.next();
                    scanner.nextLine();
                    // Para que no se repita el mensaje

                    // Ocupar asiento
                    asientos.ocuparAsiento(asientoElegido);
                    System.out.println("Asiento " + asientoElegido
                            + " reservado con éxito.");
                    asientos.mostrarAsientos();

                    System.out.println("¿Quieres comprar "
                            + "otro boleto? (si - no)");
                    opcion_2 = scanner.nextLine();
                    // Para que no se repita el mensaje
                }

                System.out.println("Gracias por tu compra. "
                        + "¡Disfruta la película!");
                break;

            case "no":
                System.out.println("Ok, nos vemos otro dia.");
                break;

            default:
                System.out.println("Opción no válida,"
                        + " por favor ingresa 'si' o 'no'.");
                break;
        }
    }
}
