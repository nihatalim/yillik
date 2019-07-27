package tr.com.nihatalim.yillik.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User extends BaseModel{
    private String Mail;
    private String Password;
    private BaseModel.Role Role;

    @OneToMany(mappedBy = "User")
    private Collection<Admin> Admins = new ArrayList<>();
    @OneToMany(mappedBy = "User")
    private Collection<Student> Students = new ArrayList<>();
    @OneToMany(mappedBy = "User")
    private Collection<Studio> Studios = new ArrayList<>();

}
