package br.com.natan.ecommerce.ecommerce_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.natan.ecommerce.ecommerce_api.service.CustomerService;
import br.com.natan.ecommerce.ecommerce_api.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
  private CustomerService service;

  public CustomerController(CustomerService service) {
    this.service = service;
  }

  @GetMapping
  public List<Customer> getAll() {
    return service.findAll();
  }

  @PostMapping
  public Customer create(@RequestBody Customer customer) {
    return service.save(customer);
  }

}
