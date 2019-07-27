package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
public class Admin extends BaseModel{

    @Column(nullable = false)
    private String Name;

    @ManyToOne
    private User User;

}
