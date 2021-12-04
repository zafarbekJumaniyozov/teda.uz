package mathers.uz.Employee.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import mathers.uz.Employee.entity.template.AbsNameEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Region extends AbsNameEntity {
    @ManyToOne
    private Country country;

    // -------"/1"
}
