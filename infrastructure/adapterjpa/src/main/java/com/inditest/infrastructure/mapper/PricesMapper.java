package com.inditest.infrastructure.mapper;

import com.inditest.domain.model.Prices;
import com.inditest.domain.model.PricesBuilder;
import com.inditest.infrastructure.entities.PricesEntity;

import java.util.Objects;

public class PricesMapper {

    private PricesMapper() {
    }

    public static Prices toDto(PricesEntity prices) {
        if (Objects.nonNull(prices)) {
            return PricesBuilder.builder()
                    .price(prices.getPrice())
                    .brand(BrandMapper.toDto(prices.getBrand()))
                    .startDate(prices.getStartDate())
                    .endDate(prices.getEndDate())
                    .priceList(prices.getPriceList())
                    .productId(prices.getProductId())
                    .priority(prices.getPriority())
                    .currency(prices.getCurrency())
                    .build();
        }
        return null;
    }

    public static PricesEntity toEntity(Prices pricesDTO) {
        if (Objects.nonNull(pricesDTO)) {
            PricesEntity prices = new PricesEntity();
            prices.setPrice(pricesDTO.getPrice());
            prices.setBrand(BrandMapper.toEntity(pricesDTO.getBrand()));
            prices.setStartDate(pricesDTO.getStartDate());
            prices.setEndDate(pricesDTO.getEndDate());
            prices.setPriceList(pricesDTO.getPriceList());
            prices.setProductId(pricesDTO.getProductId());
            prices.setPriority(pricesDTO.getPriority());
            prices.setPrice(pricesDTO.getPrice());
            prices.setCurrency(pricesDTO.getCurrency());
            return prices;
        }
        return null;
    }

}
