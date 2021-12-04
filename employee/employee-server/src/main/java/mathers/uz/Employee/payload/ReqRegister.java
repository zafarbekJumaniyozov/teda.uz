package mathers.uz.Employee.payload;

import lombok.Data;
import mathers.uz.Employee.entity.enums.GenderEnum;

import java.util.Date;

@Data
public class ReqRegister {

    private String firstName;

    private String lastName;

    private String middleName;

    private Date birthDate;

    private GenderEnum gender;

    private String phoneNumber;

    private String password;

    private String prePassword;
}
