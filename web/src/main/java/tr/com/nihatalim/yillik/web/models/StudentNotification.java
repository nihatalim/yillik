package tr.com.nihatalim.yillik.web.models;

import javax.persistence.*;

@Entity
@Table(name = "student_notification")
public class StudentNotification extends BaseModel{

    @ManyToOne
    private Student Student;

    @ManyToOne
    private Notification Notification;

}
