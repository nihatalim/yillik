package tr.com.nihatalim.yillik.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student_notification")
@Data
@NoArgsConstructor
public class StudentNotification extends BaseModel{
    private int StudentID;
    private Student Student;
    private int NotificationID;
    private Notification Notification;



}
