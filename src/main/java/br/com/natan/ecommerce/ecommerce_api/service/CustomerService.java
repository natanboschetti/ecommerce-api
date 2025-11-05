package br.com.natan.ecommerce.ecommerce_api.service;

import br.com.natan.ecommerce.ecommerce_api.model.Customer;
import br.com.natan.ecommerce.ecommerce_api.repository.CustomerRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  private final CustomerRepository repo;

  public CustomerService(CustomerRepository repo) {
    this.repo = repo;
  }

  public List<Customer> findAll() {
    return repo.findAll();
  }

  public Customer save(Customer customer) {
    return repo.save(customer);
  }
}
