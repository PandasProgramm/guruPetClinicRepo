package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.models.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public record VetController(@Qualifier("vetServiceMap") CrudService<Vet, Long> vetServiceMap) {

    @GetMapping("/vets")
    public Model getVets(Model model) {
        return model.addAllAttributes(this.vetServiceMap.findAll());
    }
}
