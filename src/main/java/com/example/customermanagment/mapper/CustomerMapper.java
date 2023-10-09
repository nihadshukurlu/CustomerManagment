package com.example.customermanagment.mapper;

import com.example.customermanagment.dto.CustomerDto;
import com.example.customermanagment.dto.request.CustomerRequest;
import com.example.customermanagment.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer dtoToEntity(CustomerDto customerDto);
    CustomerDto entityToDto(Customer customer);
    List<CustomerDto> entityToDtoList(List<Customer> customerList);

    Customer requestToEntity(CustomerRequest request);

}
