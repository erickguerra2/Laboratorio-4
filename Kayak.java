import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayak implements InterfazReserva {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void login() {
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        Usuario usuario = autenticarUsuario(nombreUsuario, contraseña);

        if (usuario != null) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + usuario.getUsuario() + "!");
        } else {
            System.out.println("Inicio de sesión fallido. Verifique sus credenciales.");
        }
    }

    @Override
    public void registroUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.print("Seleccione el tipo de usuario (Gratis/VIP): ");
        String tipoUsuario = scanner.nextLine();

        if (!tipoUsuario.equalsIgnoreCase("Gratis") && !tipoUsuario.equalsIgnoreCase("VIP")) {
            System.out.println("Tipo de usuario no válido. Se asignará como usuario Gratis.");
            tipoUsuario = "Gratis";
        }

        Usuario nuevoUsuario = new Usuario(nombreUsuario, contraseña, tipoUsuario);
        usuarios.add(nuevoUsuario);

        System.out.println("Registro exitoso. ¡Bienvenido a Kayak, " + nombreUsuario + "!");
    }

    @Override
    public void cambiarPassword() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }

        System.out.print("Ingrese su nueva contraseña: ");
        String nuevaContraseña = scanner.nextLine();

        obtenerUsuarioActual().setContraseña(nuevaContraseña);

        System.out.println("Contraseña cambiada exitosamente.");
    }

    @Override
    public void reservacion() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados. Debe registrarse primero.");
            return;
        }

        System.out.print("Ingrese la fecha de vuelo: ");
        String fechaVuelo = scanner.nextLine();

        System.out.print("¿Es ida y vuelta? (true/false): ");
        boolean esIdaYVuelta = scanner.nextBoolean();
        scanner.nextLine();  // Consumir el salto de línea

        System.out.print("Ingrese la cantidad de boletos: ");
        int cantidadBoletos = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        System.out.print("Ingrese la aerolínea: ");
        String aerolinea = scanner.nextLine();

        Usuario usuarioActual = obtenerUsuarioActual();

        Reserva nuevaReserva = new Reserva(fechaVuelo, cantidadBoletos, esIdaYVuelta, aerolinea, usuarioActual);
        reservas.add(nuevaReserva);

        System.out.println("Reserva realizada exitosamente.");
    }

    @Override
    public void confirmacion() {
        System.out.println("Función no disponible para usuarios gratis.");
    }

    @Override
    public void itinerario() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados. Debe registrarse primero.");
            return;
        }

        Usuario usuarioActual = obtenerUsuarioActual();

        if (usuarioActual != null) {
            System.out.println("Itinerario de " + usuarioActual.getUsuario() + ":");

            Reserva ultimaReserva = obtenerUltimaReserva();

            if (ultimaReserva != null) {
                System.out.println("Fecha de vuelo: " + ultimaReserva.getFechaVuelo());
                System.out.println("Cantidad de boletos: " + ultimaReserva.getCantidadBoletos());
                System.out.println("Aerolínea: " + ultimaReserva.getAerolinea());
            } else {
                System.out.println("No hay reservas disponibles.");
            }
        } else {
            System.out.println("No hay usuarios registrados. Debe registrarse primero.");
        }
    }

    
    /** 
     * @param nombreUsuario
     * @param contraseña
     * @return Usuario
     */
    public Usuario autenticarUsuario(String nombreUsuario, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña)) {
                return usuario;
            }
        }
        return null;
    }

    
    /** 
     * @return Usuario
     */
    public Usuario obtenerUsuarioActual() {
        if (!usuarios.isEmpty()) {
            return usuarios.get(usuarios.size() - 1);
        } else {
            System.out.println("No hay usuarios registrados.");
            return null;
        }
    }

    
    /** 
     * @return Reserva
     */
    public Reserva obtenerUltimaReserva() {
        if (!reservas.isEmpty()) {
            return reservas.get(reservas.size() - 1);
        } else {
            System.out.println("No hay reservas disponibles.");
            return null;
        }
    }
}
