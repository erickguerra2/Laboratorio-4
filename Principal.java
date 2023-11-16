/**
 * Autor: Erick Guerra
 * Correo: gue23208@uvg.edu.gt
 * Fecha de creación: 09/11/2023
 * Fecha de finalización: 15/11/2023
 * Lenguaje: Java
 */
//Las interfaces estan complicadas
import java.util.Scanner;

public class Principal {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kayak kayak = new Kayak();
        Usuario usuario = null;

        int opcion;
        do {
            System.out.println("Bienvenido a Kayak!");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    kayak.login();
                    usuario = kayak.obtenerUsuarioActual();
                    break;
                case 2:
                    kayak.registroUsuario();
                    usuario = kayak.obtenerUsuarioActual();
                    break;
                case 3:
                    System.out.println("¡Gracias por usar Kayak! Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

            if (usuario != null) {
                // Menú adicional para usuarios autenticados
                int opcionUsuario;
                do {
                    System.out.println("\nMenú de opciones:");
                    System.out.println("1. Realizar reserva");
                    System.out.println("2. Cambiar contraseña");
                    System.out.println("3. Ver itinerario");
                    System.out.println("4. Cerrar sesión");
                    System.out.print("Seleccione una opción: ");

                    opcionUsuario = scanner.nextInt();
                    scanner.nextLine();  

                    switch (opcionUsuario) {
                        case 1:
                            kayak.reservacion();
                            break;
                        case 2:
                            kayak.cambiarPassword();
                            break;
                        case 3:
                            kayak.itinerario();
                            break;
                        case 4:
                            System.out.println("Sesión cerrada. ¡Hasta luego, " + usuario.getUsuario() + "!");
                            usuario = null;
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    }
                } while (opcionUsuario != 4);
            }

        } while (opcion != 3);

        scanner.close();
    }
}
