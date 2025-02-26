package fr.epsi.b3devc1.bestioles.Repository;

import fr.epsi.b3devc1.bestioles.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
