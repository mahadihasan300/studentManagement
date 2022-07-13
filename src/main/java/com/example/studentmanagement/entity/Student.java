package com.example.studentmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Integer id;
    private String name;
}
