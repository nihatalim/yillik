package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student_notification")
@Data
@NoArgsConstructor
public class StudentNotification extends BaseModel{

    private int StudentID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "StudentID"))
    private Student Student;

    private int NotificationID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "NotificationID"))
    private Notification Notification;

}
