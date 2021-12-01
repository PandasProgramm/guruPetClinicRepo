package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.models.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public record OwnerController(@Qualifier("ownerServiceMap") CrudService<Owner, Long> ownerServiceMap) {

    @GetMapping("/owners")
    public Model getOwners(Model model) {
        return model.addAllAttributes(this.ownerServiceMap.findAll());
    }
}
