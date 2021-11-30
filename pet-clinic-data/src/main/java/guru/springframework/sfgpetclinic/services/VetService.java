package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.models.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetService extends CrudRepository<Vet, Long> {
}