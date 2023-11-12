package esprit.gestionfoyer.endpoints;

import esprit.gestionfoyer.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    private IUniversiteService service;

}
