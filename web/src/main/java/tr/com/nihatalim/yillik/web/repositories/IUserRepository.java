package tr.com.nihatalim.yillik.web.repositories;

import tr.com.nihatalim.yillik.web.models.User;

import java.util.concurrent.CompletableFuture;

public interface IUserRepository{
    void createUser(User user);
    CompletableFuture<User> GetUserByTokenAsync(String token);
}
