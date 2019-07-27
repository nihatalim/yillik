package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student_notification")
@Data
@NoArgsConstructor
public class StudentNotification extends BaseModel{

    @ManyToOne
    private Student Student;

    @ManyToOne
    private Notification Notification;

}
