package com.process.Shop.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Data

public class User {
    private String fullName;
    private Date birthday;
    private String identificationType;
    private String identification;
    private String phone;
    private String email;
    private String password;
    private String address;



}
