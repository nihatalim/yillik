package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "notification")
@Data
@NoArgsConstructor
public class Notification extends BaseModel{

    @Column(nullable = false)
    private String Title;

    @Column(nullable = false)
    private String Body;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date EndDate;

    @ManyToOne
    private Studio Studio;

    @ManyToOne
    private Season Season;

    @OneToMany(mappedBy = "Notification")
    private Collection<GradeNotification> gradeNotifications = new ArrayList<>();

    @OneToMany(mappedBy = "Notification")
    private Collection<SchoolNotification> SchoolNotifications = new ArrayList<>();

    @OneToMany(mappedBy = "Notification")
    private Collection<StudentNotification> StudentNotifications = new ArrayList<>();

}
