package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "studio")
@Data
@NoArgsConstructor
public class Studio extends BaseModel{

    @Column(nullable = false)
    private String Name;

    private int UserID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "UserID"))
    private User User;

    private boolean IsPremium;
    private boolean IsSystemActive;

    @OneToMany(mappedBy = "Studio")
    private Collection<School> Schools = new ArrayList<>();

    @OneToMany(mappedBy = "Studio")
    private Collection<Student> Students = new ArrayList<>();

    @OneToMany(mappedBy = "Studio")
    private Collection<Notification> Notifications = new ArrayList<>();

    @OneToMany(mappedBy = "Studio")
    private Collection<Season> Seasons = new ArrayList<>();

    @OneToMany(mappedBy = "Studio")
    private Collection<Grade> Grades = new ArrayList<>();

}
