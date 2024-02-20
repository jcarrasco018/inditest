package com.inditest.domain.persistence;

import com.inditest.domain.model.Brand;

public interface BrandPersistencePort {

    void save(Brand brand);
}
