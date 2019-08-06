package tr.com.nihatalim.yillik.web.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends BaseModel{

    @Column(nullable = false)
    private String Mail;

    @Column(nullable = false)
    private String Password;

    @Column(nullable = false)
    private Enums.Role Role;

    @Column(nullable = true)
    private String Token;

    @OneToMany(mappedBy = "User")
    private List<Admin> Admins;

    @OneToMany(mappedBy = "User")
    private List<Student> Students;

    @OneToMany(mappedBy = "User")
    private List<Studio> Studios;

    public User(){}

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Enums.Role getRole() {
        return Role;
    }

    public void setRole(Enums.Role role) {
        Role = role;
    }

    public List<Admin> getAdmins() {
        return Admins;
    }

    public void setAdmins(List<Admin> admins) {
        Admins = admins;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }

    public List<Studio> getStudios() {
        return Studios;
    }

    public void setStudios(List<Studio> studios) {
        Studios = studios;
    }
}
