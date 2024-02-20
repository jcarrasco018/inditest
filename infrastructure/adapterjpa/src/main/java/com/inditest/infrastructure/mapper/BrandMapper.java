package com.inditest.infrastructure.mapper;


import com.inditest.domain.model.Brand;
import com.inditest.infrastructure.entities.BrandEntity;

import java.util.Objects;

public class BrandMapper {

    private BrandMapper(){}

    public static Brand toDto(BrandEntity brand){
        if (Objects.nonNull(brand)) {
            Brand brandDTO = new Brand();
            brandDTO.setId(brand.getId());
            brandDTO.setName(brand.getName());
            return brandDTO;
        }
        return null;
    }

    public static BrandEntity toEntity(Brand brandDTO){
        if (Objects.nonNull(brandDTO)) {
            BrandEntity brand = new BrandEntity();
            brand.setId(brandDTO.getId());
            brand.setName(brandDTO.getName());
        return brand;
        }
        return null;
    }

}
