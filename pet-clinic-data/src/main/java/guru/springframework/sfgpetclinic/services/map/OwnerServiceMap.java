package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Owner;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findByID(aLong);
    }


    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.deleteByObject(object);
    }
}
