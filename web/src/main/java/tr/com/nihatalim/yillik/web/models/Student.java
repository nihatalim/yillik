package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
public class Student extends BaseModel{
    private String Name;
    private boolean IsAccepted;
    private BaseModel.Gender Gender;
    private int UserID;
    private User User;
    private int StudioID;
    private Studio Studio;
    private int SchoolID;
    private School School;
    private int GradeID;
    private Grade Grade;
    private int SeasonID;
    private Season Season;

    private List<StudentNotification> Notifications = new ArrayList<>();
    private List<Article> IncomingArticles = new ArrayList<>();
    private List<Article> OutgoingArticles = new ArrayList<>();
}
