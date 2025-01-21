package foro.hub.Foro_Hub.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

/**
 * Repositorio JPA para la entidad Usuario.
 *
 * Extiende JpaRepository para proporcionar operaciones CRUD básicas sobre la entidad Usuario.
 * Define un método personalizado para buscar un usuario por su nombre de usuario.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    UserDetails findByLogin(String username);
}
