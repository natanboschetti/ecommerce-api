package br.com.natan.ecommerce.ecommerce_api.model;

import java.time.LocalDateTime;
import java.util.List;

import br.com.natan.ecommerce.ecommerce_api.model.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Order {
  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne
  private Customer customer;

  @ManyToMany
  private List<Product> products;

  private LocalDateTime createdAt;
}
