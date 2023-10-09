package com.example.customermanagment.controller;

import com.example.customermanagment.dto.OrderDto;
import com.example.customermanagment.dto.request.OrderRequest;
import com.example.customermanagment.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;


    @GetMapping("/getById/{id}")
    public OrderDto getOrderById(@PathVariable Long id){
        return service.getOrderById(id);
    }

    @GetMapping("/getAll")
    public List<OrderDto> getAll(){
        return service.getOrderList();
    }

    @PutMapping("/update/{id}")
    public OrderDto updateOrder(@RequestBody OrderRequest request,@PathVariable Long id){
        return service.updateOrder(request,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody OrderRequest request){
        service.saveOrder(request);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }


}
