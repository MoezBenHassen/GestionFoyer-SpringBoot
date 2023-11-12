package esprit.gestionfoyer.endpoints;


import esprit.gestionfoyer.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import esprit.gestionfoyer.entities.Foyer;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    public IFoyerService foyerService;

    @GetMapping("")
    public List<Foyer> findAllFoyer(){
        return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/byId/{id}")
    public Foyer findFoyerById(@PathVariable long id) {
        return foyerService.retrieveFoyer(id);
    }

    @PostMapping("")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    @PutMapping("")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return foyerService.updateFoyer(f);
    }

    @DeleteMapping("delete/{id}")
    public void deleteFoyer(@PathVariable long id){
        foyerService.removeFoyer(id);
    }

}
