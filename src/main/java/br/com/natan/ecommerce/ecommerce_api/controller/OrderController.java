package br.com.natan.ecommerce.ecommerce_api.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.natan.ecommerce.ecommerce_api.service.OrderService;
import br.com.natan.ecommerce.ecommerce_api.model.Order;
import br.com.natan.ecommerce.ecommerce_api.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {
  public OrderService service;

  public OrderController(OrderService service) {
    this.service = service;
  }

  @GetMapping
  public List<Order> getAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public Order getById(@PathVariable Long id) {
    return service.findById(id);
  }
}
