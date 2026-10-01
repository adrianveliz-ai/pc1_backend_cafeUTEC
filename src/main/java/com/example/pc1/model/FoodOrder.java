package com.example.pc1.model;

import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
@Entity
public class FoodOrder {

    @Id
    @GeneratedValue
    private Long id;
    private Long custumerId;
    private Long productId;

    @Positive
    private Integer quantity;
    private BigDecimal totalAmount;
    private ZonedDateTime createdAt;
    private String status;

    public FoodOrder() {}

    public FoodOrder(Long id, Long custumerId, Long productId, Integer quantity, BigDecimal totalAmount, ZonedDateTime createdAt, String status) {
        this.id = id;
        this.custumerId = custumerId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.createdAt = createdAt;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustumerId() {
        return custumerId;
    }

    public void setCustumerId(Long custumerId) {
        this.custumerId = custumerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public @Positive Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(@Positive Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
