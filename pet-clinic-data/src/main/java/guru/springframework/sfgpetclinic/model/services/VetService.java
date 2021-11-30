package guru.springframework.sfgpetclinic.model.services;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetService extends CrudRepository<Vet, Long> {
}
