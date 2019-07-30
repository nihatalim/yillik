package tr.com.nihatalim.yilliik.dto.models;

import java.util.ArrayList;
import java.util.Collection;

public class Student extends BaseModel{
    public String Name;
    public boolean IsAccepted;
    public BaseModel.Gender Gender;
    public User User;
    public Studio Studio;
    public School School;
    public Grade Grade;
    public Season Season;
    public Collection<StudentNotification> Notifications = new ArrayList<>();
    public Collection<Article> IncomingArticles = new ArrayList<>();
    public Collection<Article> OutgoingArticles = new ArrayList<>();
}
