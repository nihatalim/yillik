package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "season")
@Data
@NoArgsConstructor
public class Season extends BaseModel{

    public String Name;

    public int StudioID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "StudioID"))
    public Studio Studio;

    @OneToMany(mappedBy = "Season")
    private Collection<Student> Students = new ArrayList<>();

    @OneToMany(mappedBy = "Season")
    private Collection<School> Schools = new ArrayList<>();

    @OneToMany(mappedBy = "Season")
    private Collection<Grade> Grades = new ArrayList<>();

    @OneToMany(mappedBy = "Season")
    private Collection<Article> Articles = new ArrayList<>();

    @OneToMany(mappedBy = "Season")
    private Collection<Notification> Notifications = new ArrayList<>();
}
