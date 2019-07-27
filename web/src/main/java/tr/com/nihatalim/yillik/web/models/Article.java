package tr.com.nihatalim.yillik.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "article")
@Data
@NoArgsConstructor
public class Article extends BaseModel{
    private String Title;
    private String Body;
    private int FromStudentID;
    private Student FromStudent;
    private int ToStudentID;
    private Student ToStudent;
    private int SeasonID;
    private Season Season;
}
