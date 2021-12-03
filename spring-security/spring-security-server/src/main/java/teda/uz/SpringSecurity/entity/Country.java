package uz.onlineschoolcenter.App3dLearningCenter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.onlineschoolcenter.App3dLearningCenter.entity.AbsEntity.AbsEntity;

import javax.persistence.Entity;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode(callSuper = true)
@Entity
public class Country extends AbsEntity {
    private UUID uuid;

}
