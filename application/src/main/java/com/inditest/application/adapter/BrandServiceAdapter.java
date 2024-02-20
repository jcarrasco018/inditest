package com.inditest.application.adapter;

import com.inditest.application.api.BrandService;
import com.inditest.domain.model.Brand;
import com.inditest.domain.persistence.BrandPersistencePort;

public class BrandServiceAdapter implements BrandService {

    private final BrandPersistencePort brandPersistencePort;

    public BrandServiceAdapter(BrandPersistencePort brandPersistencePort) {
        this.brandPersistencePort = brandPersistencePort;
    }

    @Override
    public void save(Brand brand){
        brandPersistencePort.save(brand);
    }

}
