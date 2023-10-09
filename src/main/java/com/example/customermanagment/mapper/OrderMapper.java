package com.example.customermanagment.mapper;

import com.example.customermanagment.dto.OrderDto;
import com.example.customermanagment.dto.request.OrderRequest;
import com.example.customermanagment.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    List<OrderDto> entitytoDtoList(List<Order> orderList);

    Order entityToDto(OrderDto dto);
    OrderDto dtoToEntity(Order order);
    OrderRequest entityToRequest(Order order);
    Order requestToEntity(OrderRequest request);

}
