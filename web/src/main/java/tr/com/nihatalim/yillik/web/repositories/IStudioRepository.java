package tr.com.nihatalim.yillik.web.repositories;

import tr.com.nihatalim.yilliik.dto.models.Studio;
import tr.com.nihatalim.yilliik.dto.requests.studio.CreateStudioRequest;
import tr.com.nihatalim.yilliik.dto.responses.studio.CreateStudioResponse;
import tr.com.nihatalim.yilliik.dto.responses.studio.GetAllStudiosResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface IStudioRepository {
    CompletableFuture<CreateStudioResponse> CreateStudio(CreateStudioRequest request);
    CompletableFuture<GetAllStudiosResponse> GetAllStudios();
}
