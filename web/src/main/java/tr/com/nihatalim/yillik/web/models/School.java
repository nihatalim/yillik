package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "school")
@Data
@NoArgsConstructor
public class School extends BaseModel{

    public String Name;
    public int StudioID;
    public Studio Studio;
    public int ProvinceID;
    public Province Province;
    public int SeasonID;
    public Season Season;

    private List<Grade> grades = new ArrayList<>();
    private List<SchoolNotification> Notifications = new ArrayList<>();
    private List<Student> Students = new ArrayList<>();

}
