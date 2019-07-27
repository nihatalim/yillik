package tr.com.nihatalim.yillik.web.repositories;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import tr.com.nihatalim.yillik.web.conf.HibernateUtil;
import tr.com.nihatalim.yillik.web.models.User;

@Repository
public class UserRepository implements IUserRepository{
    private SessionFactory sessionFactory;

    public UserRepository() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void createUser(User user) {
        try{
            sessionFactory.openSession();


        }catch (Exception e){

        }
    }
}

interface IUserRepository{
    void createUser(User user);
}
