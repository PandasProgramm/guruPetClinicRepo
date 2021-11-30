package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Pet;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.deleteByObject(object);
    }
}
