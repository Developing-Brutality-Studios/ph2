package co.com.developingbrutalitystudios.r2dbc;

import co.com.developingbrutalitystudios.model.usuario.gateways.UsuarioRepository;
import co.com.developingbrutalitystudios.r2dbc.data.Usuario;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends ReactiveCrudRepository<Usuario, Long>, ReactiveQueryByExampleExecutor<Usuario> {
    //@Query("selec")
}
