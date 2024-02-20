package com.inditest.infrastructure.mapper;

import com.inditest.domain.model.Prices;
import com.inditest.infrastructure.entities.PricesEntity;

import java.util.Objects;

public class PricesMapper {

    private PricesMapper(){}

    public static Prices toDto(PricesEntity prices) {
        if (Objects.nonNull(prices)) {
            Prices pricesDTO = new Prices();
            pricesDTO.setPrice(prices.getPrice());
            pricesDTO.setBrand(BrandMapper.toDto(prices.getBrand()));
            pricesDTO.setStartDate(prices.getStartDate());
            pricesDTO.setEndDate(prices.getEndDate());
            pricesDTO.setPriceList(prices.getPriceList());
            pricesDTO.setProductId(prices.getProductId());
            pricesDTO.setPriority(prices.getPriority());
            pricesDTO.setPrice(prices.getPrice());
            pricesDTO.setCurrency(prices.getCurrency());
                return pricesDTO;
        }
        return null;
    }

    public static PricesEntity toEntity(Prices pricesDTO){
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
