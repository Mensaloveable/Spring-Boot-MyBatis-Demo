package com.loveable.mybatis.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date hireDate;
}
