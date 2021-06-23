package com.miniProject01.miniproject.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private  String email;
    private String password;
    private  long MobileNo;

//    @OneToMany(mappedBy = "user")
//
//    private List<Task> taskList;
}
