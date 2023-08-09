package co.com.developingbrutalitystudios.r2dbc.data;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("usuarios")
public class Usuario {
    @Id
    @Column("id")
    private String id;
    @Column("name")
    private String name;
    @Column("contrasena")
    private String contrasena;
    @Column("user_name")
    private String userName;
    @Column("user_image")
    private String userImage;
}
