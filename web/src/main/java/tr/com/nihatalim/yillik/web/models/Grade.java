package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "grade")
@Data
@NoArgsConstructor
public class Grade extends BaseModel{

    @Column(nullable = false)
    private String Name;

    @ManyToOne
    private Season Season;

    @ManyToOne
    private Studio Studio;

    @ManyToOne
    private School School;

    @OneToMany(mappedBy = "Grade")
    private Collection<Student> Students = new ArrayList<>();

    @OneToMany(mappedBy = "Grade")
    private Collection<GradeNotification> gradeNotifications = new ArrayList<>();

}
