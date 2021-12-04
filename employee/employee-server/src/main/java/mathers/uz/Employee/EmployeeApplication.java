package mathers.uz.Employee;

import lombok.extern.java.Log;
import mathers.uz.Employee.entity.Employee;
import mathers.uz.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

    @Autowired
    public EmployeeRepository  employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = Employee.builder()
                
                .firstName("Zafarbek")
                .lastname("Jumaniyozov")
                .email("zafarbek19980219@gmail.com")
                .build();
        Employee employee2 = Employee.builder()
                .firstName("Yunusbek")
                .lastname("Jumaniyozov")
                .email("yunusbek20010608@gmail.com")
                .build();
        Employee employee3 = Employee.builder()
                .firstName("Nizomjon")
                .lastname("Jumaniyozov")
                .email("nizomjon@gmail.com")
                .build();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }
}
