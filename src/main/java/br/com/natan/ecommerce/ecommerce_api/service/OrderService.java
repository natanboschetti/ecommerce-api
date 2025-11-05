package br.com.natan.ecommerce.ecommerce_api.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import br.com.natan.ecommerce.ecommerce_api.model.Order;
import br.com.natan.ecommerce.ecommerce_api.repository.OrderRepository;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private final OrderRepository repo;

  public OrderService(OrderRepository repo) {
    this.repo = repo;
  }

  public List<Order> findAll() {
    return repo.findAll();
  }

  public Order save(Order order) {
    return repo.save(order);
  }

  public Order findById(Long id) {
    return repo.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
  }

}
