package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "school")
@Data
@NoArgsConstructor
public class School extends BaseModel{

    public String Name;

    public int StudioID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "StudioID"))
    public Studio Studio;

    public int ProvinceID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "ProvinceID"))
    public Province Province;

    public int SeasonID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "SeasonID"))
    public Season Season;

    @OneToMany(mappedBy = "School")
    private Collection<Grade> grades = new ArrayList<>();

    @OneToMany(mappedBy = "School")
    private Collection<SchoolNotification> Notifications = new ArrayList<>();

    @OneToMany(mappedBy = "School")
    private Collection<Student> Students = new ArrayList<>();

}
