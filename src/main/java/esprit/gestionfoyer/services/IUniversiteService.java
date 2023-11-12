package esprit.gestionfoyer.services;

import java.util.List;
import esprit.gestionfoyer.entities.Universite;
public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (long idUniversite);
}
