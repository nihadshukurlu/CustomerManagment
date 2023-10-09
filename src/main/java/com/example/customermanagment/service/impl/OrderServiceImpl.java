package com.example.customermanagment.service.impl;

import com.example.customermanagment.dto.OrderDto;
import com.example.customermanagment.dto.request.OrderRequest;
import com.example.customermanagment.mapper.OrderMapper;
import com.example.customermanagment.model.Order;
import com.example.customermanagment.repository.OrderRepository;
import com.example.customermanagment.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;


    @Override
    public OrderDto getOrderById(Long id) {
        return OrderMapper.INSTANCE.dtoToEntity(repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Order cannot find")));
    }

    @Override
    public List<OrderDto> getOrderList() {
        return OrderMapper.INSTANCE.entitytoDtoList(repository.findAll());
    }

    @Override
    public void saveOrder(OrderRequest request) {
        repository.save(OrderMapper.INSTANCE.requestToEntity(request));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public OrderDto updateOrder(OrderRequest request, Long id) {
        Order order = repository.findById(id).orElseThrow(()-> new RuntimeException("order cannot find"));
        return OrderMapper.INSTANCE.dtoToEntity(repository.save(order));
    }
}
