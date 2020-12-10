package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.*;

public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
        
        // Ejecutando el listado de usuarios
        List<Usuario> usuarios = usuarioJDBC.select();
        for (Usuario usuario: usuarios) {
            System.out.println("Usuario: " + usuario);
        }
        
        // Insertamos un nuevo usuario
//        Usuario usuario = new Usuario("pedro.lopez", "123");
//        usuarioJDBC.insert(usuario);

        // Modificar un usuario existente
//        Usuario usuario = new Usuario(3, "carlos.juarez", "456");
//        usuarioJDBC.update(usuario);

        // Eliminar un usuario existente
//        usuarioJDBC.delete(new Usuario(3));
    }
}
