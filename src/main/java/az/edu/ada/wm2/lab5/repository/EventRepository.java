package az.edu.ada.wm2.lab5.repository;

import az.edu.ada.wm2.lab5.model.Event;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EventRepository {
    Event save(Event event);
    Optional<Event> findById(UUID id);
    List<Event> findAll();
    void deleteById(UUID id);
    boolean existsById(UUID id);
}
