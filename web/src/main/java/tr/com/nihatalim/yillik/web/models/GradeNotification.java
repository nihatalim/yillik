package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "grade_notification")
@Data
@NoArgsConstructor
public class GradeNotification extends BaseModel{

    @ManyToOne
    private Grade Grade;

    @ManyToOne
    private Notification Notification;

}
