package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User extends BaseModel{

    @Column(nullable = false)
    private String Mail;

    @Column(nullable = false)
    private String Password;

    @Column(nullable = false)
    private BaseModel.Role Role;

    @OneToMany(mappedBy = "User")
    private Collection<Admin> Admins = new ArrayList<>();

    @OneToMany(mappedBy = "User")
    private Collection<Student> Students = new ArrayList<>();

    @OneToMany(mappedBy = "User")
    private Collection<Studio> Studios = new ArrayList<>();

}
