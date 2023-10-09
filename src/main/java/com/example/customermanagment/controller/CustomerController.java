package com.example.customermanagment.controller;

import com.example.customermanagment.dto.CustomerDto;
import com.example.customermanagment.dto.request.CustomerRequest;
import com.example.customermanagment.model.Customer;
import com.example.customermanagment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @GetMapping("/getById/{id}")
    public CustomerDto getById(@PathVariable Long id){
        return service.getCustomerById(id);
    }

    @GetMapping("/getAll")
    public List<CustomerDto> getAll(){
        return service.getCustomerList();
    }

    @PutMapping("/update/{id}")
    public Customer update(@RequestBody CustomerRequest request, @PathVariable Long id){
        return service.updateCustomer(request,id);
    }

    @PostMapping("/save")
    public void save(CustomerRequest request){
        service.saveCustomer(request);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

}
