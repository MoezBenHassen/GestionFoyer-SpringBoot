package esprit.gestionfoyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Entity
@Data
public class Reservation {
    @Id
    @Generated
    private long idReservation;
    private String anneeUniversitaire;
    private Boolean estValide;

    @ManyToMany
    private List<Etudiant> etudiants;
}
