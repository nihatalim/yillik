package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "grade")
@Data
@NoArgsConstructor
public class Grade extends BaseModel{

    private String Name;

    private int SeasonID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "SeasonID"))
    private Season Season;

    private int StudioID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "StudioID"))
    private Studio Studio;

    private int SchoolID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "SchoolID"))
    private School School;

    @OneToMany(mappedBy = "Grade")
    private Collection<Student> Students = new ArrayList<>();

    @OneToMany(mappedBy = "Grade")
    private Collection<GradeNotification> gradeNotifications = new ArrayList<>();

}
