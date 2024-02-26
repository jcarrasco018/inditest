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

    public Brand getBrand() {
        return brand;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public Long getPriceList() {
        return priceList;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getPriority() {
        return priority;
    }

    public Double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    protected void setBrand(Brand brand) {
        this.brand = brand;
    }

    protected void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    protected void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    protected void setPriceList(Long priceList) {
        this.priceList = priceList;
    }

    protected void setProductId(Long productId) {
        this.productId = productId;
    }

    protected void setPriority(Integer priority) {
        this.priority = priority;
    }

    protected void setPrice(Double price) {
        this.price = price;
    }

    protected void setCurrency(String currency) {
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

