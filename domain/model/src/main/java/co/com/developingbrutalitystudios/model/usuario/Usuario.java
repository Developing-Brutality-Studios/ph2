package co.com.developingbrutalitystudios.model.usuario;
import lombok.*;
//import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Usuario {
    private String id;
    private String name;
    private String contrasena;
    private String userName;
    private String userImage;
}
