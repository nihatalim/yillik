package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "grade")
@Data
@NoArgsConstructor
public class Grade extends BaseModel{
    private String Name;
    private int SeasonID;
    private Season Season;
    private int StudioID;
    private Studio Studio;
    private int SchoolID;
    private School School;

    private List<Student> Students = new ArrayList<>();
    private List<GradeNotification> gradeNotifications = new ArrayList<>();
}
