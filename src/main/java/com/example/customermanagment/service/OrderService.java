package com.example.customermanagment.service;

import com.example.customermanagment.dto.OrderDto;
import com.example.customermanagment.dto.request.OrderRequest;

import java.util.List;

public interface OrderService {

    OrderDto getOrderById(Long id);
    List<OrderDto> getOrderList();
    void saveOrder(OrderRequest request);
    void deleteById(Long id);
    OrderDto updateOrder(OrderRequest request,Long id);

}
