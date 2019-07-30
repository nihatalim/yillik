package tr.com.nihatalim.yilliik.dto.models;

import java.util.ArrayList;
import java.util.Collection;

public class Season extends BaseModel{
    public String Name;
    public Studio Studio;
    public Collection<Student> Students = new ArrayList<>();
    public Collection<School> Schools = new ArrayList<>();
    public Collection<Grade> Grades = new ArrayList<>();
    public Collection<Article> Articles = new ArrayList<>();
    public Collection<Notification> Notifications = new ArrayList<>();
}
