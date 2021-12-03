package uz.mathers.SpringSecurityMySql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import uz.mathers.SpringSecurityMySql.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityMysqlApplication {




    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityMysqlApplication.class, args);
    }

}
