package tr.com.nihatalim.yilliik.dto.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Notification extends BaseModel{
    public String Title;
    public String Body;
    public Date EndDate;
    public Studio Studio;
    public Season Season;
    public Collection<GradeNotification> gradeNotifications = new ArrayList<>();
    public Collection<SchoolNotification> SchoolNotifications = new ArrayList<>();
    public Collection<StudentNotification> StudentNotifications = new ArrayList<>();
}
