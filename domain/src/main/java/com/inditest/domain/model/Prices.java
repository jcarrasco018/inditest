package com.inditest.domain.model;

import java.time.Instant;
import java.util.Objects;

public class Prices {
    private Long id;
    private Brand brand;
    private Instant startDate;
    private Instant endDate;
    private Long priceList;
    private Long productId;
    private Integer priority;
    private Double price;
    private String currency;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    public Long getPriceList() {
        return priceList;
    }

    public void setPriceList(Long priceList) {
        this.priceList = priceList;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prices pricesDTO = (Prices) o;
        return Objects.equals(id, pricesDTO.id) && Objects.equals(brand, pricesDTO.brand) && Objects.equals(startDate, pricesDTO.startDate) && Objects.equals(endDate, pricesDTO.endDate) && Objects.equals(priceList, pricesDTO.priceList) && Objects.equals(productId, pricesDTO.productId) && Objects.equals(priority, pricesDTO.priority) && Objects.equals(price, pricesDTO.price) && Objects.equals(currency, pricesDTO.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, startDate, endDate, priceList, productId, priority, price, currency);
    }
}

