package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "article")
@Data
@NoArgsConstructor
public class Article extends BaseModel{

    private String Title;
    private String Body;

    @ManyToOne
    private Student FromStudent;

    @ManyToOne
    private Student ToStudent;

    @ManyToOne
    private Season Season;

}
