package sg.edu.nus.iss.paf_day26.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Show {
    private String name;
    private String type;
    private Integer runtime;
    private List<String> genres;
    private Document rating;
    
}
