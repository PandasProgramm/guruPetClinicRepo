package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.models.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerService extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastname);

}
