package com.example.customermanagment.service;

import com.example.customermanagment.dto.CustomerDto;
import com.example.customermanagment.dto.request.CustomerRequest;
import com.example.customermanagment.model.Customer;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getCustomerList();
    CustomerDto getCustomerById(Long id);
    Customer updateCustomer(CustomerRequest request,Long id);
    void saveCustomer(CustomerRequest request);
    void deleteById(Long id);

}
