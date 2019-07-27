package tr.com.nihatalim.yillik.web.repositories.Impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import tr.com.nihatalim.yillik.web.models.User;
import tr.com.nihatalim.yillik.web.repositories.IUserRepository;

@Repository
public class UserRepository implements IUserRepository {
    private SessionFactory sessionFactory;

    public UserRepository() {

    }

    @Override
    public void createUser(User user) {
        try{
            sessionFactory.openSession();


        }catch (Exception e){

        }
    }
}

