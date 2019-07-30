package tr.com.nihatalim.yillik.web.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "student")
public class Student extends BaseModel{

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private boolean IsAccepted;

    @Column(nullable = false)
    private Enums.Gender Gender;

    @ManyToOne
    private User User;

    @ManyToOne
    private Studio Studio;

    @ManyToOne
    private School School;

    @ManyToOne
    private Grade Grade;

    @ManyToOne
    private Season Season;

    @OneToMany(mappedBy = "Student")
    private Collection<StudentNotification> Notifications = new ArrayList<>();

    @OneToMany(mappedBy = "ToStudent")
    private Collection<Article> IncomingArticles = new ArrayList<>();

    @OneToMany(mappedBy = "FromStudent")
    private Collection<Article> OutgoingArticles = new ArrayList<>();
}
