package esprit.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class Chambre {
    @Id
    @Generated
    private long idChambre;

    private String nomChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reservation> reservations;

}
