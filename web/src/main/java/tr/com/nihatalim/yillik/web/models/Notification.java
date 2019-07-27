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

    private String Title;
    private String Body;

    @Temporal(TemporalType.DATE)
    private Date EndDate;

    private int StudioID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "StudioID"))
    private Studio Studio;

    private int SeasonID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "SeasonID"))
    private Season Season;

    @OneToMany(mappedBy = "Notification")
    private Collection<GradeNotification> gradeNotifications = new ArrayList<>();

    @OneToMany(mappedBy = "Notification")
    private Collection<SchoolNotification> SchoolNotifications = new ArrayList<>();

    @OneToMany(mappedBy = "Notification")
    private Collection<StudentNotification> StudentNotifications = new ArrayList<>();

}
