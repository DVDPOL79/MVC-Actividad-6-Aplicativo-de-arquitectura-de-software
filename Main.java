package MVC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear la vista
        VistaUsuario vista = new VistaUsuario();

        // Crear el controlador
        ControladorUsuario controlador = new ControladorUsuario(vista);

        // Ciclo para mostrar el menú y permitir al usuario interactuar
        boolean continuar = true;

        while (continuar) {
            // Mostrar el menú
            String opcion = vista.mostrarMenu();

            switch (opcion) {
                case "Ver usuarios":
                    controlador.mostrarUsuarios();
                    break;

                case "Agregar usuario":
                    String nombre = vista.solicitarNombre();
                    String correo = vista.solicitarCorreo();
                    String rol = vista.solicitarRol();
                    controlador.agregarUsuario(nombre, correo, rol);
                    break;

                case "Borrar usuario":
                    String nombreBorrar = vista.solicitarNombreParaBorrar();
                    controlador.borrarUsuario(nombreBorrar);
                    break;

                case "Salir":
                    continuar = false;
                    break;
            }
        }

        System.out.println("Fin del programa.");
    }
}
