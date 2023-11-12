package esprit.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Entity
@Data
public class Bloc {
    @Id
    @Generated
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne(cascade = CascadeType.ALL)
    private Foyer foyer;

    //
    //@OneToMany(mappedBy = "bloc", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    // FetchType.Lazy : Load only Bloc data
    // FetchType.Eager : Load Bloc data and Chambre data
    // By default, the fetch type for @ManyToOne and @OneToOne relationships is EAGER
    // CascadeType.ALL : Apply all operations on Chambre to Bloc
    // CascadeType.PERSIST : Apply only persist operation on Chambre to Bloc
    // CascadeType.MERGE : Apply only merge operation on Chambre to Bloc
    // CascadeType.REMOVE : Apply only remove operation on Chambre to Bloc
    // CascadeType.REFRESH : Apply only refresh operation on Chambre to Bloc
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;
}
