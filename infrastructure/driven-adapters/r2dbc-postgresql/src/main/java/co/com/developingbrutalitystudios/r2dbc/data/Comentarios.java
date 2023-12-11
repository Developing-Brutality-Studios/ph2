package co.com.developingbrutalitystudios.r2dbc.data;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("comentarios")
public class Comentarios {
    @Id
    @Column("id")
    private String id;
    @Column("comentario")
    private String comentario;
    @Column("video_id")
    private String videoId;
    @Column("is_root")
    private Boolean isRoot;
    @Column("id_root")
    private String idRoot;
}
