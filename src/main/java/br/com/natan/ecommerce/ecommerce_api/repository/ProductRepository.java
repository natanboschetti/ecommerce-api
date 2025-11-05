package br.com.natan.ecommerce.ecommerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.natan.ecommerce.ecommerce_api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
