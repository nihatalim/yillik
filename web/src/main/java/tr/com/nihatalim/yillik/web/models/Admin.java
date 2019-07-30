package tr.com.nihatalim.yillik.web.models;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin extends BaseModel{

    @Column(nullable = false)
    private String Name;

    @ManyToOne
    private User User;

}
