package tr.com.nihatalim.yilliik.dto.models;

import java.util.ArrayList;
import java.util.Collection;

public class Studio extends BaseModel{
    public String Name;
    public User User;
    public boolean IsPremium;
    public boolean IsSystemActive;
    public Collection<School> Schools = new ArrayList<>();
    public Collection<Student> Students = new ArrayList<>();
    public Collection<Notification> Notifications = new ArrayList<>();
    public Collection<Season> Seasons = new ArrayList<>();
    public Collection<Grade> Grades = new ArrayList<>();
}
