package com.example.customermanagment.service.impl;

import com.example.customermanagment.dto.CustomerDto;
import com.example.customermanagment.dto.request.CustomerRequest;
import com.example.customermanagment.mapper.CustomerMapper;
import com.example.customermanagment.model.Customer;
import com.example.customermanagment.repository.CustomerRepository;
import com.example.customermanagment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;


    @Override

    public List<CustomerDto> getCustomerList() {
        return CustomerMapper.INSTANCE.entityToDtoList(repository.findAll());
    }

    @Override
    public CustomerDto getCustomerById(Long id) {
        return CustomerMapper.INSTANCE.entityToDto(repository.findById(id).orElseThrow(()-> new RuntimeException("customer can not find")));
    }

    @Override
    public Customer updateCustomer(CustomerRequest request, Long id) {
        return repository.save(CustomerMapper.INSTANCE.requestToEntity(request));
    }

    @Override
    public void saveCustomer(CustomerRequest request) {
        repository.save(CustomerMapper.INSTANCE.requestToEntity(request));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
