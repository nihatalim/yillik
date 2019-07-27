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

    private int FromStudentID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name ="FromStudentID"))
    private Student FromStudent;

    private int ToStudentID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name ="ToStudentID"))
    private Student ToStudent;

    private int SeasonID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name ="SeasonID"))
    private Season Season;

}
