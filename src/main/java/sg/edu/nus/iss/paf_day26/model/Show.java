package sg.edu.nus.iss.paf_day26.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Show {
    private Integer id;
    private String name;
    private String type;
    private String language;
    private Integer runtime;
}
