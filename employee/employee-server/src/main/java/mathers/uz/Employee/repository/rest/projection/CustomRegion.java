package mathers.uz.Employee.repository.rest.projection;

import mathers.uz.Employee.entity.Country;
import mathers.uz.Employee.entity.Region;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "customRegion", types = Region.class)
public interface CustomRegion {
    Integer getId();

    String getNameUz();

    String getNameRu();

    String getNameEn();

    Country getCountry();

    @Value("#{target.country.id}")
    Integer getCountryId();
}
