package tr.com.nihatalim.yilliik.dto.models;

import java.util.ArrayList;
import java.util.Collection;

public class Grade extends BaseModel{
    public String Name;
    public Season Season;
    public Studio Studio;
    public School School;
    public Collection<Student> Students = new ArrayList<>();
    public Collection<GradeNotification> gradeNotifications = new ArrayList<>();
}
