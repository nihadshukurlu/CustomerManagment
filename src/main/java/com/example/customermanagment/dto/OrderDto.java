package com.example.customermanagment.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDto {
    private Long id;
    private String orderName;

}
