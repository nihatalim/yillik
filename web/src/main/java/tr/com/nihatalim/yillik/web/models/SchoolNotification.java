package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "school_notification")
@Data
@NoArgsConstructor
public class SchoolNotification extends BaseModel{

    @ManyToOne
    private School School;

    @ManyToOne
    private Notification Notification;

}
