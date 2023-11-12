package esprit.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Entity
@Data
public class Foyer {
    @Id
    @Generated
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne
    private Universite universite;

    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    private List<Bloc> blocs;
}
