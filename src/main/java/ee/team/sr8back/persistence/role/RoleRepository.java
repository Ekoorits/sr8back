package ee.team.sr8back.persistence.role;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    @NotNull Role getRoleById(Integer id);
}