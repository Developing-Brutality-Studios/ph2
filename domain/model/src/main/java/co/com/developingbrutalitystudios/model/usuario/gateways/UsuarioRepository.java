package co.com.developingbrutalitystudios.model.usuario.gateways;

import co.com.developingbrutalitystudios.model.usuario.Usuario;
import reactor.core.publisher.Mono;

public interface UsuarioRepository {
    public Mono<Boolean> crearUsuario(Usuario usuario);
}
