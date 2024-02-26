package com.inditest.infrastructure.repositories;


import com.inditest.infrastructure.entities.PricesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public interface PricesRepository extends CrudRepository<PricesEntity,Integer> {

    @Query("SELECT p FROM Prices p WHERE p.brand.id =  ?1 AND p.productId = ?2 AND p.startDate <= ?3 AND p.endDate >= ?3 order by priority desc limit 1")
    Optional<PricesEntity> findByBrandIdAndProductIdAndDateRange(Long brandId, Long productId, Instant date);

}
