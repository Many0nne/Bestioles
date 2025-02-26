package fr.epsi.b3devc1.bestioles.Repository;

import fr.epsi.b3devc1.bestioles.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
