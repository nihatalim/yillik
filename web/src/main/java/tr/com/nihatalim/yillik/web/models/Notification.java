package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "notification")
@Data
@NoArgsConstructor
public class Notification extends BaseModel{
    private String Title;
    private String Body;
    private Date EndDate;
    private int StudioID;
    private Studio Studio;
    private int SeasonID;
    private Season Season;

    private List<GradeNotification> gradeNotifications = new ArrayList<>();
    private List<SchoolNotification> SchoolNotifications = new ArrayList<>();
    private List<StudentNotification> StudentNotifications = new ArrayList<>();
}
