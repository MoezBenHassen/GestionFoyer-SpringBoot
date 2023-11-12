package esprit.gestionfoyer.services;

import esprit.gestionfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant (Etudiant e);
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant (long idEtudiant);
    void removeEtudiant (long idEtudiant);

}
