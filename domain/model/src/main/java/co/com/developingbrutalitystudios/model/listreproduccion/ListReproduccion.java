package co.com.developingbrutalitystudios.model.listreproduccion;
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
public class ListReproduccion {
    private String name;
    private List<String> videos;
    private String ownerId;
    private Boolean isPrivate;

}
