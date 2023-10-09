package com.example.customermanagment.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerRequest {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private Integer age;


}
