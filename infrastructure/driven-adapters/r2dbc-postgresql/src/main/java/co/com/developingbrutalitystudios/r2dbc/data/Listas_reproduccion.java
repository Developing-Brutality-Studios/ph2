package co.com.developingbrutalitystudios.r2dbc.data;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("listas_reproduccion")
public class Listas_reproduccion {
    @Id
    @Column("id")
    private String id;
    @Column("name")
    private String name;
    @Column("owner_id")
    private String ownerid;
    @Column("is_private")
    private String isprivate;
}
