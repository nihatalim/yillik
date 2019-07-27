package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "season")
@Data
@NoArgsConstructor
public class Season extends BaseModel{
    public String Name;
    public int StudioID;
    public Studio Studio;

    private List<Student> Students = new ArrayList<>();
    private List<School> Schools = new ArrayList<>();
    private List<Grade> Grades = new ArrayList<>();
    private List<Article> Articles = new ArrayList<>();
    private List<Notification> Notifications = new ArrayList<>();
}
