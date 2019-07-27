package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
public class Student extends BaseModel{

    private String Name;
    private boolean IsAccepted;
    private BaseModel.Gender Gender;

    private int UserID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "UserID"))
    private User User;

    private int StudioID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "StudioID"))
    private Studio Studio;

    private int SchoolID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "SchoolID"))
    private School School;

    private int GradeID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "GradeID"))
    private Grade Grade;

    private int SeasonID;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "SeasonID"))
    private Season Season;

    @OneToMany(mappedBy = "Student")
    private Collection<StudentNotification> Notifications = new ArrayList<>();

    @OneToMany(mappedBy = "ToStudent")
    private Collection<Article> IncomingArticles = new ArrayList<>();

    @OneToMany(mappedBy = "FromStudent")
    private Collection<Article> OutgoingArticles = new ArrayList<>();
}
