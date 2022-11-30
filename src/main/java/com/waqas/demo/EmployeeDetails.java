package com.waqas.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor //This property will help you create a constructor which requires all fields
@NoArgsConstructor //This property will help you create a constructor which do not require any field
public class EmployeeDetails {
    private String firstName;
    private String lastName;
    private int age;
    private float salary;

    //public EmployeeDetails(String firstName, String lastName, int age, float salary){}
}
