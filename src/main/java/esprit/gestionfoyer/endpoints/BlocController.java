package esprit.gestionfoyer.endpoints;

import esprit.gestionfoyer.services.BlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {
    BlocService blocService;

    @GetMapping("")
    public void findAllBloc(){
        blocService.retrieveAllBlocs();
    }

    @GetMapping("/byId/{id}")
    public void findBlocById(long id) {
        blocService.retrieveBloc(id);
    }

    @PostMapping("")
    public void addBloc() {
        blocService.addBloc(null);
    }

    @PutMapping("")
    public void updateBloc() {
        blocService.updateBloc(null);
    }

    @DeleteMapping("delete/{id}")
    public void deleteBloc(long id){
        blocService.removeBloc(id);
    }


}
