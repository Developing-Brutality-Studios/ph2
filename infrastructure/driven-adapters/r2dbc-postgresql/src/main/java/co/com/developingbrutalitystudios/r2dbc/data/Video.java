package co.com.developingbrutalitystudios.r2dbc.data;

import co.com.developingbrutalitystudios.model.reaction.Reaction;
import co.com.developingbrutalitystudios.model.videocategory.VideoCategory;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Data
@Builder
@Table("video")
public class Video {
    @Column("titulo")
    private String titulo;
    @Column("miniatura")
    private String miniatura;
    @Column("src")
    private String src;
    @Column("src360")
    private String src360;
    @Column("src144")
    private String src144;
    @Column("ownerid")
    private String ownerId;
    //@Column("")
    //private List<VideoCategory> categories;
    @Id
    @Column("id")
    private String id;
    //@Column("")
    //private List<Reaction> reactions;
}
