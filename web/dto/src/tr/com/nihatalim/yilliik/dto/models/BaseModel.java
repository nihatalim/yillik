package tr.com.nihatalim.yilliik.dto.models;

import java.util.Date;

public abstract class BaseModel {
    public int ID;
    public Date CreatedDate;
    public Date UpdatedDate;

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