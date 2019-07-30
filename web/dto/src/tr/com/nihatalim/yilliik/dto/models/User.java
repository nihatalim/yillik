package tr.com.nihatalim.yilliik.dto.models;

import java.util.ArrayList;
import java.util.Collection;

public class User extends BaseModel{
    public String Mail;
    public String Password;
    public BaseModel.Role Role;
    public Collection<Admin> Admins = new ArrayList<>();
    public Collection<Student> Students = new ArrayList<>();
    public Collection<Studio> Studios = new ArrayList<>();
}
