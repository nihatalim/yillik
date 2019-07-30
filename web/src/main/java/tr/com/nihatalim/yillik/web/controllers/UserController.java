package tr.com.nihatalim.yillik.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.nihatalim.yillik.web.repositories.IUserRepository;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value="user", produces = "application/json")
public class UserController {
    private final IUserRepository userRepository;

    public UserController(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    // This is a basic implementation of asynchronous function.
    @RequestMapping(value = "get")
    public CompletableFuture<String> get(){
        return CompletableFuture.completedFuture("selam" + Thread.currentThread().getName());
    }
}
