package com.inditest.infrastructure.repositories;


import com.inditest.infrastructure.entities.BrandEntity;
import org.springframework.data.repository.CrudRepository;

public interface BrandRepository extends CrudRepository<BrandEntity,Integer> {
}
