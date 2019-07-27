package tr.com.nihatalim.yillik.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "province")
@Data
@NoArgsConstructor
public class Province extends BaseModel{

    @Column(nullable = false)
    private String Name;

    @OneToMany(mappedBy = "Province")
    private Collection<School> Schools = new ArrayList<>();

}
