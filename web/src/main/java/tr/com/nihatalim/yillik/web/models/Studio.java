package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "studio")
@Data
@NoArgsConstructor
public class Studio extends BaseModel{

    private String Name;
    private int UserID;
    private User User;
    private boolean IsPremium;
    private boolean IsSystemActive;


    private List<School> Schools = new ArrayList<>();
    private List<Student> Students = new ArrayList<>();
    private List<Notification> Notifications = new ArrayList<>();
    private List<Season> Seasons = new ArrayList<>();
    private List<Grade> Grades = new ArrayList<>();
}
