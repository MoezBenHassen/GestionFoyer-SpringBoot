package esprit.gestionfoyer.repositories;

import esprit.gestionfoyer.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
