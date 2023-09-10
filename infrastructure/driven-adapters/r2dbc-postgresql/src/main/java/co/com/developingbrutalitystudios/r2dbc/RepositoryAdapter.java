package co.com.developingbrutalitystudios.r2dbc;

import co.com.developingbrutalitystudios.model.usuario.Usuario;
import co.com.developingbrutalitystudios.model.usuario.gateways.UsuarioRepository;
import co.com.developingbrutalitystudios.r2dbc.helper.ReactiveAdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import reactor.core.publisher.Mono;

@org.springframework.stereotype.Repository
public class RepositoryAdapter extends ReactiveAdapterOperations<Usuario/* change for domain model */, co.com.developingbrutalitystudios.r2dbc.data.Usuario/* change for adapter model */, Long, IUserRepository> implements UsuarioRepository
// implements ModelRepository from domain
{
    public RepositoryAdapter(IUserRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Usuario.class/* change for domain model */));
    }

    @Override
    public Mono<Boolean> crearUsuario(Usuario usuario) {
        co.com.developingbrutalitystudios.r2dbc.data.Usuario user = new co.com.developingbrutalitystudios.r2dbc.data.Usuario(null, usuario.getName(), usuario.getContrasena(), usuario.getUserName(), usuario.getUserImage());
        // co.com.developingbrutalitystudios.r2dbc.data.Usuario user = mapper.map(usuario, co.com.developingbrutalitystudios.r2dbc.data.Usuario.class);
        return repository.save(user).map(usuario1 -> usuario1 != null);
    }
}
