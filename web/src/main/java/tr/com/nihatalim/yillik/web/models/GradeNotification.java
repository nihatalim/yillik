package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "grade_notification")
@Data
@NoArgsConstructor
public class GradeNotification extends BaseModel{

    private int GradeID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "GradeID"))
    private Grade Grade;

    private int NotificationID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "NotificationID"))
    private Notification Notification;

}
