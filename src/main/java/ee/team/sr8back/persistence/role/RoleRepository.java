package ee.team.sr8back.persistence.role;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query("select r from Role r where r.id = :id")
    @NotNull Role getRoleById(@Param("id") Integer id);

    @Query("select r from Role r where r.name = :roleName")
    Role getRoleBy(String roleName);


}