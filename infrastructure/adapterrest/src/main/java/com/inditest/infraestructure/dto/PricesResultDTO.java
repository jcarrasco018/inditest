package com.inditest.infraestructure.dto;

import java.time.Instant;
import java.util.Objects;

public class PricesResultDTO {

    private Long productId;
    private Long brandId;
    private Double price;
    private String currency;
    private Long priceList;
    private Instant startDate;
    private Instant endDate;

    public PricesResultDTO(){}

    public PricesResultDTO(Long productId, Long brandId, Double price, String currency, Long priceList, Instant startDate, Instant endDate) {
        this.productId = productId;
        this.brandId = brandId;
        this.price = price;
        this.currency = currency;
        this.priceList = priceList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
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

    public Long getPriceList() {
        return priceList;
    }

    public void setPriceList(Long priceList) {
        this.priceList = priceList;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PricesResultDTO that = (PricesResultDTO) o;
        return Objects.equals(productId, that.productId) && Objects.equals(brandId, that.brandId) && Objects.equals(price, that.price) && Objects.equals(currency, that.currency) && Objects.equals(priceList, that.priceList) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, brandId, price, currency, priceList, startDate, endDate);
    }

    @Override
    public String toString() {
        return "PricesResultDTO{" +
                "productId=" + productId +
                ", brandId=" + brandId +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", priceList=" + priceList +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
