package mathers.uz.Employee.repository.rest.projection;

import mathers.uz.Employee.entity.District;
import mathers.uz.Employee.entity.Region;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "customDistrict", types = District.class)
public interface CustomDistrict {

    Integer getId();

    String getNameUz();

    String getNameRu();

    String getNameEn();

    Region getRegion();

    @Value("#{target.region?.id?:null}")
    Integer getRegionId();
}
