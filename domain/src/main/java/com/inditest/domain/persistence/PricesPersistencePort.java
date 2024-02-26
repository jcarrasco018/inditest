package com.inditest.domain.persistence;

import com.inditest.domain.model.Prices;

import java.time.Instant;
import java.util.List;

public interface PricesPersistencePort {
    Prices findByBrandIdAndProductIdAndDateRange(Long brandId, Long productId, Instant date);

    void saveAll(List<Prices> listPrices);

    void save(Prices prices);
}
