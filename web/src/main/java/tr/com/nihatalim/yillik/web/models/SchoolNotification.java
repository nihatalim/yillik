package tr.com.nihatalim.yillik.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "school_notification")
@Data
@NoArgsConstructor
public class SchoolNotification extends BaseModel{

    private int SchoolID;
    private School School;
    private int NotificationID;
    private Notification Notification;
}
