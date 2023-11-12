package esprit.gestionfoyer.endpoints;

import esprit.gestionfoyer.entities.Etudiant;
import esprit.gestionfoyer.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    public IEtudiantService etudiantService;

    @GetMapping("")
    public List<Etudiant> findAllEtudiant(){
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/byId/{id}")
    public Etudiant findEtudiantById(@PathVariable long id) {
        return etudiantService.retrieveEtudiant(id);
    }
    @PutMapping("")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    @PostMapping("")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @DeleteMapping("delete/{id}")
    public void deleteEtudiant(@PathVariable long id){
        etudiantService.removeEtudiant(id);
    }
}
