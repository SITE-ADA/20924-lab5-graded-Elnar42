package az.edu.ada.wm2.lab5.repository;

import az.edu.ada.wm2.lab5.model.Event;

import java.math.BigDecimal;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class EventRepositoryImpl implements EventRepository {
    private final Map<UUID, Event> eventStore = new HashMap<>();

    @Override
    public Event save(Event event) {
        if (event.getId() == null) {
            event.setId(UUID.randomUUID());
        }
        eventStore.put(event.getId(), event);
        return event;
    }

    @Override
    public Optional<Event> findById(UUID id) {
        return Optional.ofNullable(eventStore.get(id));
    }

    @Override
    public List<Event> findAll() {
        return new ArrayList<>(eventStore.values());
    }

    @Override
    public void deleteById(UUID id) {
        eventStore.remove(id);
    }

    @Override
    public boolean existsById(UUID id) {
        return eventStore.containsKey(id);
    }


}
