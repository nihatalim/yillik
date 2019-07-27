package tr.com.nihatalim.yillik.web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "province")
@Data
@NoArgsConstructor
public class Province extends BaseModel{
    private String Name;
    private List<School> Schools = new ArrayList<>();
}
