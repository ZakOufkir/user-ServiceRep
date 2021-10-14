package com.zakCoding.userService.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long userId;

    private String address;
    private String dob;
    private String city;
    private Enum Gender;
    private String phoneNumber;


}
