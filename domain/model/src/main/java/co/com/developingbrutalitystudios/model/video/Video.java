package co.com.developingbrutalitystudios.model.video;
import co.com.developingbrutalitystudios.model.reaction.Reaction;
import co.com.developingbrutalitystudios.model.videocategory.VideoCategory;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.PrimitiveIterator;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Video {
    private String titulo;
    private String miniatura;
    private String src;
    private String src360;
    private String src144;
    private String ownerId;
    private List<VideoCategory> categories;
    private String id;
    private List<Reaction> reactions;
}
