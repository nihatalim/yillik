package tr.com.nihatalim.yillik.web.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Temporal(TemporalType.DATE)
    private Date CreatedDate;

    @Temporal(TemporalType.DATE)
    private Date UpdatedDate;

    public BaseModel(){
        this.CreatedDate = new Date();
        this.UpdatedDate = new Date();
    }

    public enum Role{
        ADMIN, STUDIO, STUDENT
    }

    public enum Gender{
        MAN, WOMAN
    }
}

