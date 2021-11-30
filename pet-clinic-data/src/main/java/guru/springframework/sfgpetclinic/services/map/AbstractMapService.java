package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> implements CrudService<T, Long> {

    protected Map<ID, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    protected T findByID(ID id) {
        return this.map.get(id);
    }

    protected T save(ID id, T object) {
        return this.map.put(id, object);
    }

    protected void deleteById(ID id) {
        this.map.remove(id);
    }

    protected void deleteByObject(T object) {
        this.map.entrySet().removeIf(item -> item.getValue().equals(object));
    }
}
