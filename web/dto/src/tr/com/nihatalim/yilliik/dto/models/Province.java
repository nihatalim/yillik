package tr.com.nihatalim.yilliik.dto.models;

import java.util.ArrayList;
import java.util.Collection;

public class Province extends BaseModel{
    public String Name;
    public Collection<School> Schools = new ArrayList<>();
}
