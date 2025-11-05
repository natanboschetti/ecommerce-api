package br.com.natan.ecommerce.ecommerce_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.natan.ecommerce.ecommerce_api.model.Product;
import br.com.natan.ecommerce.ecommerce_api.service.ProductService;

import org.springframework.web.bind.annotation.RequestBody;;

@RestController
@RequestMapping("/products")
public class ProductController {
  private final ProductService service;

  public ProductController(ProductService service) {
    this.service = service;
  }

  @GetMapping
  public List<Product> getAll() {
    return service.findAll();
  }

  @PostMapping
  public Product create(@RequestBody Product product) {
    return service.save(product);
  }
}
