package tr.com.nihatalim.yilliik.dto.models;

import java.util.ArrayList;
import java.util.Collection;

public class School extends BaseModel{
    public String Name;
    public Studio Studio;
    public Province Province;
    public Season Season;
    public Collection<Grade> grades = new ArrayList<>();
    public Collection<SchoolNotification> Notifications = new ArrayList<>();
    public Collection<Student> Students = new ArrayList<>();

}
