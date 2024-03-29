package tr.com.nihatalim.yillik.web.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "studio")
public class Studio extends BaseModel{

    @Column(nullable = false)
    public String Name;

    @ManyToOne
    public User User;

    @Column(nullable = false)
    public boolean IsPremium;

    @Column(nullable = false)
    public boolean IsSystemActive;

    @OneToMany(mappedBy = "Studio")
    public Collection<School> Schools = new ArrayList<>();

    @OneToMany(mappedBy = "Studio")
    public Collection<Student> Students = new ArrayList<>();

    @OneToMany(mappedBy = "Studio")
    public Collection<Notification> Notifications = new ArrayList<>();

    @OneToMany(mappedBy = "Studio")
    public Collection<Season> Seasons = new ArrayList<>();

    @OneToMany(mappedBy = "Studio")
    public Collection<Grade> Grades = new ArrayList<>();

    public Studio(){}
}
