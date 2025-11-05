package br.com.natan.ecommerce.ecommerce_api.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import br.com.natan.ecommerce.ecommerce_api.dto.OrderDTO;
import br.com.natan.ecommerce.ecommerce_api.model.Customer;
import br.com.natan.ecommerce.ecommerce_api.model.Order;
import br.com.natan.ecommerce.ecommerce_api.model.Product;
import br.com.natan.ecommerce.ecommerce_api.repository.CustomerRepository;
import br.com.natan.ecommerce.ecommerce_api.repository.OrderRepository;
import br.com.natan.ecommerce.ecommerce_api.repository.ProductRepository;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private final OrderRepository orderRepository;
  private final CustomerRepository customerRepository;
  private final ProductRepository productRepository;

  public OrderService(OrderRepository orderRepository,
      CustomerRepository customerRepository,
      ProductRepository productRepository) {
    this.orderRepository = orderRepository;
    this.customerRepository = customerRepository;
    this.productRepository = productRepository;
  }

  public List<Order> findAll() {
    return orderRepository.findAll();
  }

  public Order findById(Long id) {
    return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
  }

  public Order createOrder(OrderDTO orderDTO) {
    Customer customer = customerRepository.findById(orderDTO.getCustomerId())
        .orElseThrow(() -> new RuntimeException("Customer not found"));

    List<Product> products = orderDTO.getProductIds().stream()
        .map(id -> productRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Product not found: " + id)))
        .collect(Collectors.toList());

    Order order = new Order();
    order.setCustomer(customer);
    order.setProducts(products);

    return orderRepository.save(order);
  }

}
