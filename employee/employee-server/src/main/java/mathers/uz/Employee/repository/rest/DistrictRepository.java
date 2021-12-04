package mathers.uz.Employee.repository.rest;

import mathers.uz.Employee.entity.District;
import mathers.uz.Employee.repository.rest.projection.CustomDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "/district", collectionResourceRel = "list", excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District, Integer> {
}
