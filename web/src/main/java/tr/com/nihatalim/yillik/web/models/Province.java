package tr.com.nihatalim.yillik.web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "province")
public class Province extends BaseModel{

    @Column(nullable = false)
    private String Name;

    @OneToMany(mappedBy = "Province")
    private Collection<School> Schools = new ArrayList<>();

}
