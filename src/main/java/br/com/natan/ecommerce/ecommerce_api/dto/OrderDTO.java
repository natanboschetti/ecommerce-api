package br.com.natan.ecommerce.ecommerce_api.dto;

import java.util.List;

public class OrderDTO {
  private Long customerId;
  private List<Long> productIds;

  // Getters and Setters
  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public List<Long> getProductsIds() {
    return productIds;
  }

  public void setProductIds(List<Long> productsIds) {
    this.productIds = productsIds;
  }
}
