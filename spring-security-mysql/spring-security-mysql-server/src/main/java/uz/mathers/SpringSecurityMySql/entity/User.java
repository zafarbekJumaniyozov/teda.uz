package uz.mathers.SpringSecurityMySql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

   private String userName;

   private String password;

   private boolean active;

   private String roles;





}

