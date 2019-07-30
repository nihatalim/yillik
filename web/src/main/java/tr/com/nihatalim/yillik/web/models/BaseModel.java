package tr.com.nihatalim.yillik.web.models;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int ID;

    @Temporal(TemporalType.DATE)
    public Date CreatedDate;

    @Temporal(TemporalType.DATE)
    public Date UpdatedDate;

    public BaseModel(){
        this.CreatedDate = new Date();
        this.UpdatedDate = new Date();
    }
}

