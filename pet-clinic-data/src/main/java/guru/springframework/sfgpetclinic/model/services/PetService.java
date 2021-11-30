package guru.springframework.sfgpetclinic.model.services;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetService extends CrudRepository<Pet, Long> {
}
