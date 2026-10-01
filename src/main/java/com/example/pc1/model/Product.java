package com.example.pc1.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private Store storeId;
    @NotNull
    @NotBlank
    private String name;

    @Positive
    private BigDecimal price;

    @PositiveOrZero
    private Integer stock;

    private String status;

    public Product(Long id, Store storeId, String name, BigDecimal price, Integer stock, String status) {
        this.id = id;
        this.storeId = storeId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Store getStoreId() {
        return storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

    public @NotNull @NotBlank String getName() {
        return name;
    }

    public void setName(@NotNull @NotBlank String name) {
        this.name = name;
    }

    public @Positive BigDecimal getPrice() {
        return price;
    }

    public void setPrice(@Positive BigDecimal price) {
        this.price = price;
    }

    public @PositiveOrZero Integer getStock() {
        return stock;
    }

    public void setStock(@PositiveOrZero Integer stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
