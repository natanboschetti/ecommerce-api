package br.com.natan.ecommerce.ecommerce_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.natan.ecommerce.ecommerce_api.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
