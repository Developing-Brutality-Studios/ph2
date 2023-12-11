package co.com.developingbrutalitystudios.model.comentary;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Comentary {
    private String videoId;
    private List<Comentary> respuestas;
    private Boolean isRoot;
    private String idRoot;
}
