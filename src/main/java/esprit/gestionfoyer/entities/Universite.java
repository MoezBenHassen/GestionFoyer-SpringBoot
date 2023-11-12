package esprit.gestionfoyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Universite {
    @Id
    @Generated
    private long idUniversite;
    private String nomUniversite;
    private String adresseUniversite;

    @OneToOne(mappedBy = "universite")
    private Foyer foyer;
}
