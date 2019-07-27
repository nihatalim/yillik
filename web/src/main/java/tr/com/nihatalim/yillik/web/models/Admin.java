package tr.com.nihatalim.yillik.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
public class Admin extends BaseModel{
    private String Name;
    private int UserID;

    @ManyToOne
    private User User;
}
