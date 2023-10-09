package com.example.customermanagment.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {

    private String name;
    private String surname;
    private String email;
    private String username;
    private Integer age;


}
