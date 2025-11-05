package br.com.natan.ecommerce.ecommerce_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.natan.ecommerce.ecommerce_api.model.Product;
import br.com.natan.ecommerce.ecommerce_api.repository.ProductRepository;

@Service
public class ProductService {
  private final ProductRepository repo;

  public ProductService(ProductRepository repo) {
    this.repo = repo;
  }

  public List<Product> findAll() {
    return repo.findAll();
  }

  public Product save(Product product) {
    return repo.save(product);
  }
}
