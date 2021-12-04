package mathers.uz.Employee.repository.rest.projection;

import mathers.uz.Employee.entity.Country;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "customCountry", types = Country.class)
public interface CustomCountry {
    Integer getId();

    String getNameUz();

    String getNameRu();

    String getNameEn();
}
