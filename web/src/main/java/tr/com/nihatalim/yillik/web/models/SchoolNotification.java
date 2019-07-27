package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "school_notification")
@Data
@NoArgsConstructor
public class SchoolNotification extends BaseModel{

    private int SchoolID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "SchoolID"))
    private School School;

    private int NotificationID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "NotificationID"))
    private Notification Notification;

}
