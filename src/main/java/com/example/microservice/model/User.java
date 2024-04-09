package com.example.microservice.model;

import lombok.Data;

@Data
public class User implements Serializable{
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

}
