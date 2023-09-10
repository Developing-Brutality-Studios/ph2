package co.com.developingbrutalitystudios.usecase.registeruser;

import co.com.developingbrutalitystudios.model.usuario.Usuario;
import co.com.developingbrutalitystudios.model.usuario.gateways.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class RegisterUserUseCase {

    private final UsuarioRepository repository;
    public Mono<Boolean> registrarUsuario(Mono<Usuario> usuario){
        usuario.map(RegisterUserUseCase::printuser);
        return usuario.flatMap(usuario1 -> repository.crearUsuario(usuario1));
    }
    public static Usuario printuser (Usuario usuario){
        System.out.println(usuario);
        return usuario;
    }

}
