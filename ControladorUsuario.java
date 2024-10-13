
package MVC;

import java.util.List;
import java.util.ArrayList;

public class ControladorUsuario {
    private List<Usuario> usuarios;
    private VistaUsuario vista;

    public ControladorUsuario(VistaUsuario vista) {
        this.usuarios = new ArrayList<>();
        this.vista = vista;
    }

    // Agregar un nuevo usuario
    public void agregarUsuario(String nombre, String correo, String rol) {
        Usuario nuevoUsuario = new Usuario(nombre, correo, rol);
        usuarios.add(nuevoUsuario);
    }

    // Mostrar todos los usuarios
    public void mostrarUsuarios() {
        vista.mostrarUsuarios(usuarios);
    }

    // Borrar un usuario por nombre
    public void borrarUsuario(String nombre) {
        usuarios.removeIf(usuario -> usuario.getNombre().equalsIgnoreCase(nombre));
    }
}
