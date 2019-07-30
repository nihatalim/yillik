package tr.com.nihatalim.yilliik.dto.responses.studio;

import tr.com.nihatalim.yilliik.dto.models.Studio;
import tr.com.nihatalim.yilliik.dto.responses.BaseResponse;

import java.util.ArrayList;
import java.util.List;

public class GetAllStudiosResponse extends BaseResponse {
    public List<Studio> studios = new ArrayList<>();
}
