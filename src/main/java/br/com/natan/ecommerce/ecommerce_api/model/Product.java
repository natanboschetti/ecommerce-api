package br.com.natan.ecommerce.ecommerce_api.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String description;
  private BigDecimal price;
}
