package mathers.uz.Employee.repository.rest;

import mathers.uz.Employee.entity.Role;
import mathers.uz.Employee.entity.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/role")
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(RoleName name);
}
