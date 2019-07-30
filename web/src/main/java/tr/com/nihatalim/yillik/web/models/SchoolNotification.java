package tr.com.nihatalim.yillik.web.models;

import javax.persistence.*;

@Entity
@Table(name = "school_notification")
public class SchoolNotification extends BaseModel{

    @ManyToOne
    private School School;

    @ManyToOne
    private Notification Notification;

}
