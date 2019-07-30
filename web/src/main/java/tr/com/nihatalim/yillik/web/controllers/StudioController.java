package tr.com.nihatalim.yillik.web.controllers;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import tr.com.nihatalim.yilliik.dto.models.Studio;
import tr.com.nihatalim.yilliik.dto.requests.studio.CreateStudioRequest;
import tr.com.nihatalim.yilliik.dto.responses.studio.CreateStudioResponse;
import tr.com.nihatalim.yilliik.dto.responses.studio.GetAllStudiosResponse;
import tr.com.nihatalim.yillik.web.repositories.IStudioRepository;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "/api/studio")
public class StudioController {
    private final IStudioRepository repository;

    public StudioController(IStudioRepository repository){
        this.repository = repository;
    }

    @PostMapping(value = "CreateStudio", produces = "application/json")
    public CompletableFuture<CreateStudioResponse> CreateStudio(@RequestBody CreateStudioRequest request){
        return this.repository.CreateStudio(request);
    }

    @Async
    @GetMapping(value = "All")
    public CompletableFuture<GetAllStudiosResponse> GetStudios() throws ExecutionException, InterruptedException {
        CompletableFuture<GetAllStudiosResponse> getAllStudiosResponseCompletableFuture = this.repository.GetAllStudios();
        GetAllStudiosResponse response = getAllStudiosResponseCompletableFuture.get();
        response.result.message = "Thead: " + Thread.currentThread().getName();
        return CompletableFuture.completedFuture(response);
    }
}
