package esprit.gestionfoyer.services;

import esprit.gestionfoyer.entities.Universite;
import esprit.gestionfoyer.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return (universiteRepository.findAll().isEmpty()) ? null : universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return  universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return  universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }
}
