package tr.com.nihatalim.yillik.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "grade_notification")
@Data
@NoArgsConstructor
public class GradeNotification extends BaseModel{
    private int GradeID;
    private Grade Grade;
    private int NotificationID;
    private Notification Notification;
}
