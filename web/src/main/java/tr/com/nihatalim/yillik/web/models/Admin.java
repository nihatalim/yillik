package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
public class Admin extends BaseModel{

    private String Name;

    private int UserID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "UserID"))
    private User User;

}
