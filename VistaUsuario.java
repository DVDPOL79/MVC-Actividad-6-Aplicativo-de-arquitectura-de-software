package MVC;

import javax.swing.JOptionPane;
import java.util.List;

public class VistaUsuario {

    // Método para mostrar el menú principal
    public String mostrarMenu() {
        String[] opciones = {"Ver usuarios", "Agregar usuario", "Borrar usuario", "Salir"};
        return (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción",
                "Menú Principal",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    }

    // Mostrar detalles de todos los usuarios
    public void mostrarUsuarios(List<Usuario> usuarios) {
        if (usuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
        } else {
            StringBuilder mensaje = new StringBuilder();
            for (Usuario usuario : usuarios) {
                mensaje.append("Usuario: ").append(usuario.getNombre())
                        .append(", Correo: ").append(usuario.getCorreo())
                        .append(", Telefono: ").append(usuario.getRol()).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString());
        }
    }

    public String solicitarNombre() {
        return JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
    }

    public String solicitarCorreo() {
        return JOptionPane.showInputDialog("Ingrese el correo del usuario:");
    }

    public String solicitarRol() {
        return JOptionPane.showInputDialog("Ingrese el Telefono del usuario:");
    }

    public String solicitarNombreParaBorrar() {
        return JOptionPane.showInputDialog("Ingrese el nombre del usuario a borrar:");
    }
}
