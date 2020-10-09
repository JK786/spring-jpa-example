package com.springlearning.springjpaexample.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor
@ToString
public class UserRequest {

    private String firstName;

    private String lastName;

    private Integer age;



}
