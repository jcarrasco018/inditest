package com.inditest.domain.model;

import java.time.Instant;

public class PricesBuilder {

    private Long id;
    private Brand brand;
    private Instant startDate;
    private Instant endDate;
    private Long priceList;
    private Long productId;
    private Integer priority;
    private Double price;
    private String currency;

    public static PricesBuilder builder() {
        return new PricesBuilder();
    }

    public Prices build(){
        Prices prices = new Prices();
        prices.setId(id);
        prices.setBrand(brand);
        prices.setStartDate(startDate);
        prices.setEndDate(endDate);
        prices.setPriceList(priceList);
        prices.setProductId(productId);
        prices.setPrice(price);
        prices.setPriority(priority);
        prices.setCurrency(currency);
        return prices;
    }

    public PricesBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public PricesBuilder brand(Brand brand){
        this.brand = brand;
        return this;
    }

    public PricesBuilder startDate(Instant startDate){
        this.startDate = startDate;
        return this;
    }

    public PricesBuilder endDate(Instant endDate){
        this.endDate = endDate;
        return this;
    }

    public PricesBuilder priceList(Long priceList){
        this.priceList = priceList;
        return this;
    }

    public PricesBuilder productId(Long productId){
        this.productId = productId;
        return this;
    }

    public PricesBuilder priority(Integer priority){
        this.priority = priority;
        return this;
    }

    public PricesBuilder price(Double price){
        this.price = price;
        return this;
    }

    public PricesBuilder currency(String currency){
        this.currency = currency;
        return this;
    }

}
