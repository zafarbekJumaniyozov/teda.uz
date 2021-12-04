package mathers.uz.Employee.repository.rest.projection;

import mathers.uz.Employee.entity.Role;
import mathers.uz.Employee.entity.enums.RoleName;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "/customRole", types = Role.class)
public interface CustomRole {
    Integer getId();

    RoleName getName();
}
