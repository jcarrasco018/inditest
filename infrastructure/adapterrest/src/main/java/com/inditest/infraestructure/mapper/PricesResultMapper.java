package com.inditest.infraestructure.mapper;

import com.inditest.domain.model.Prices;
import com.inditest.infraestructure.dto.PricesResultDTO;

import java.util.Objects;

public class PricesResultMapper {

    private PricesResultMapper(){}
    public static PricesResultDTO toDTO(Prices prices){
        if(Objects.nonNull(prices)) {
            PricesResultDTO pricesResultDTO = new PricesResultDTO();
            pricesResultDTO.setPrice(prices.getPrice());
            pricesResultDTO.setBrandId(prices.getBrand().getId());
            pricesResultDTO.setStartDate(prices.getStartDate());
            pricesResultDTO.setEndDate(prices.getEndDate());
            pricesResultDTO.setPriceList(prices.getPriceList());
            pricesResultDTO.setProductId(prices.getProductId());
            pricesResultDTO.setPrice(prices.getPrice());
            pricesResultDTO.setCurrency(prices.getCurrency());
            return pricesResultDTO;
        }
        return null;
    }
}
