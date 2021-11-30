package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetService extends CrudRepository<Pet, Long> {
}
