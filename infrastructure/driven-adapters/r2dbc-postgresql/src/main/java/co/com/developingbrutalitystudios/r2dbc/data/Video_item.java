package co.com.developingbrutalitystudios.r2dbc.data;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("video_item")
public class Video_item {
    @Id
    @Column("id")
    private String id;
    @Column("lista_id")
    private String listaid;
    @Column("video_id")
    private String videoid;
}
