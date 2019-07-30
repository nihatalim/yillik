package tr.com.nihatalim.yillik.web.repositories.Impl;

import org.hibernate.Session;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import tr.com.nihatalim.yilliik.dto.requests.studio.CreateStudioRequest;
import tr.com.nihatalim.yilliik.dto.responses.studio.CreateStudioResponse;
import tr.com.nihatalim.yilliik.dto.responses.studio.GetAllStudiosResponse;
import tr.com.nihatalim.yillik.web.configuration.HibernateUtil;
import tr.com.nihatalim.yillik.web.models.*;
import tr.com.nihatalim.yillik.web.repositories.IAdminRepository;
import tr.com.nihatalim.yillik.web.repositories.IStudioRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class StudioRepository implements IStudioRepository {

    public StudioRepository(){
        // Session things
    }

    @Override
    public CompletableFuture<CreateStudioResponse> CreateStudio(CreateStudioRequest request) {
        /*
        // TODO Validate request
        CreateStudioResponse response = new CreateStudioResponse();
        Session session = null;
        User user = null;
        Studio studio = null;

        session = HibernateUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();

            user = new User();
            user.setMail(request.mail);
            user.setRole(Enums.Role.STUDIO);
            user.setPassword(request.password);
            user.UpdatedDate = new Date();
            user.CreatedDate = new Date();
            session.save(user);

            studio = new Studio();
            studio.Name = request.name;
            studio.IsPremium = true;
            studio.IsSystemActive = true;
            studio.User = user;

            session.save(studio);

            session.getTransaction().commit();

            response.result.status = true;
            response.result.message = "Successfully created!";
        }catch (Exception ex){
            session.getTransaction().rollback();

            response.result.status = false;
            response.result.message = "Something went wrong. Exception is: " + ex.getMessage();

            System.out.println(ex.getMessage());
        }
        */

        // TODO Validate request
        CreateStudioResponse response = new CreateStudioResponse();
        Session session = null;
        User user = null;
        Studio studio = null;

        session = HibernateUtil.getSessionFactory().openSession();
        // Kriter oluşturucu
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        // Kriter sorgulayıcı
        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
        // Model kökü
        Root<User> root = criteriaQuery.from(User.class);

        // Kriter seti
        criteriaQuery.where(criteriaBuilder.equal(root.get("Mail"), request.mail));

        // Tekli sonuç alımı.
        user = session.createQuery(criteriaQuery).getResultStream().findFirst().orElse(null);

        if(user != null){
            response.result.message = "Already registered.";
        }else{

            try{
                session.beginTransaction();

                user = new User();
                user.setMail(request.mail);
                user.setRole(Enums.Role.STUDIO);
                user.setPassword(request.password);

                session.save(user);

                studio = new Studio();
                studio.Name = request.name;
                studio.IsPremium = true;
                studio.IsSystemActive = true;
                studio.User = user;

                session.save(studio);

                session.getTransaction().commit();

                session.close();

                response.result.status = true;
                response.result.message = "Successfully created!";
            }catch (Exception ex){
                session.getTransaction().rollback();

                response.result.status = false;
                response.result.message = "Something went wrong. Exception is: " + ex.getMessage();

                System.out.println(ex.getMessage());
            }
        }


        return CompletableFuture.completedFuture(response);
    }

    @Override
    public CompletableFuture<GetAllStudiosResponse> GetAllStudios() {
        GetAllStudiosResponse response = new GetAllStudiosResponse();
        Session session = null;

        session = HibernateUtil.getSessionFactory().openSession();

        // Kriter oluşturucu
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        // Kriter sorgulayıcı
        CriteriaQuery<Studio> criteriaQuery = criteriaBuilder.createQuery(Studio.class);
        // Model kökü
        Root<Studio> root = criteriaQuery.from(Studio.class);

        criteriaQuery.select(root);

        List<Studio> resultList = session.createQuery(criteriaQuery).getResultList();

        response.studios = resultList.stream().map(studio -> {
            tr.com.nihatalim.yilliik.dto.models.Studio dto = new tr.com.nihatalim.yilliik.dto.models.Studio();
            dto.Name = studio.Name;
            return dto;
        }).collect(Collectors.toList());

        response.result.message = "Successfully.";
        response.result.status = true;

        return CompletableFuture.completedFuture(response);
    }
}

