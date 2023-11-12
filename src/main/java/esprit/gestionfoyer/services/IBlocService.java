package esprit.gestionfoyer.services;

import java.util.List;
import esprit.gestionfoyer.entities.Bloc;
public interface IBlocService {
    List<Bloc> retrieveAllBlocs();
    Bloc addBloc (Bloc b);
    Bloc updateBloc (Bloc b);
    Bloc retrieveBloc (long idBloc);
    void removeBloc (long idBloc);

}
