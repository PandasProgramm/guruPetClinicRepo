package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.models.Pet;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public record PetController(@Qualifier("petServiceMap") CrudService<Pet, Long> petServiceMap) {


    @GetMapping("/pets")
    public Model getPets(Model model) {
        return model.addAllAttributes(this.petServiceMap.findAll());
    }
}
