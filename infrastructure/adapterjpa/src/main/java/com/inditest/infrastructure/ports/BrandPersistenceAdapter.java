package com.inditest.infrastructure.ports;

import com.inditest.domain.model.Brand;
import com.inditest.domain.persistence.BrandPersistencePort;
import com.inditest.infrastructure.mapper.BrandMapper;
import com.inditest.infrastructure.repositories.BrandRepository;

import java.util.Objects;

public class BrandPersistenceAdapter implements BrandPersistencePort {

    private final BrandRepository brandRepository;

    public BrandPersistenceAdapter(BrandRepository brandRepository){
        this.brandRepository=brandRepository;
    }

    @Override
    public void save(Brand brand) {
        brandRepository.save(Objects.requireNonNull(BrandMapper.toEntity(brand)));
    }
}
