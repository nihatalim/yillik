package tr.com.nihatalim.yillik.web.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "school")
public class School extends BaseModel{

    @Column(nullable = false)
    public String Name;

    @ManyToOne
    public Studio Studio;

    @ManyToOne
    public Province Province;

    @ManyToOne
    public Season Season;

    @OneToMany(mappedBy = "School")
    private Collection<Grade> grades = new ArrayList<>();

    @OneToMany(mappedBy = "School")
    private Collection<SchoolNotification> Notifications = new ArrayList<>();

    @OneToMany(mappedBy = "School")
    private Collection<Student> Students = new ArrayList<>();

}
