package tr.com.nihatalim.yillik.web.repositories.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import tr.com.nihatalim.yillik.web.configuration.HibernateUtil;
import tr.com.nihatalim.yillik.web.models.User;
import tr.com.nihatalim.yillik.web.repositories.IUserRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.concurrent.CompletableFuture;

@Repository
public class UserRepository implements IUserRepository {

    public UserRepository() {

    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public CompletableFuture<User> GetUserByTokenAsync(String token) {
        Session session = null;
        User user = null;

        session = HibernateUtil.getSessionFactory().openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);

        Root<User> root = criteriaQuery.from(User.class);

        criteriaQuery.where(criteriaBuilder.equal(root.get("token"), token));

        user = session.createQuery(criteriaQuery).getResultList().stream().findFirst().orElse(null);

        return CompletableFuture.completedFuture(user);
    }


}

