package uz.mathers.SpringSecurityMySql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourse {


    @GetMapping("/")
    public String get(){
        return ("<h4>Welcome</h4>");
    }
        @GetMapping("/user")
    public String getUser(){
        return ("<h4>Welcome user </h4>");
    }
        @GetMapping("/admin")
    public String getAdmin(){
        return ("<h4>Welcome to Admin</h4>");
    }



}
