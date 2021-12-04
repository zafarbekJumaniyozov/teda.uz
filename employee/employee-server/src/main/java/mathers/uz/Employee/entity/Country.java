package mathers.uz.Employee.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mathers.uz.Employee.entity.template.AbsNameEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Country extends AbsNameEntity {
}
