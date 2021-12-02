package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    protected T findByID(ID id) {
        return this.map.get(id);
    }

    protected T save(T object) {
        if (object != null && object.getId() == null) {
            final Long id = this.getNextId();
            object.setId(id);
        } else {
            throw new RuntimeException("Object cannot save");
        }
        return this.map.put(object.getId(), object);
    }

    protected void deleteById(ID id) {
        this.map.remove(id);
    }

    protected void deleteByObject(T object) {
        this.map.entrySet().removeIf(item -> item.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(this.map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
