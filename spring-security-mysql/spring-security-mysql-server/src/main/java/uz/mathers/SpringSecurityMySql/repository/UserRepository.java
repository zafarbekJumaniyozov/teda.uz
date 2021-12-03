package uz.mathers.SpringSecurityMySql.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.mathers.SpringSecurityMySql.entity.User;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String userName);


}