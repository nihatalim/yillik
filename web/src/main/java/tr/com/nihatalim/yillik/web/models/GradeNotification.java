package tr.com.nihatalim.yillik.web.models;

import javax.persistence.*;

@Entity
@Table(name = "grade_notification")
public class GradeNotification extends BaseModel{

    @ManyToOne
    private Grade Grade;

    @ManyToOne
    private Notification Notification;

}
