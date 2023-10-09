package com.example.customermanagment.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderRequest {
    private Long id;
    private String orderName;

}
