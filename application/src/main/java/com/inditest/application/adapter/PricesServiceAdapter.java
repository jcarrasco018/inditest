package com.inditest.application.adapter;

import com.inditest.application.api.PricesService;
import com.inditest.domain.model.Prices;
import com.inditest.domain.persistence.PricesPersistencePort;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class PricesServiceAdapter implements PricesService {
    private final PricesPersistencePort pricesPersistencePort;

    public PricesServiceAdapter(PricesPersistencePort pricesPersistencePort) {
        this.pricesPersistencePort = pricesPersistencePort;
    }

    @Override
    public void save(Prices prices) {
        if (Objects.nonNull(prices)) {
            pricesPersistencePort.save(Objects.requireNonNull(prices));
        }
    }

    @Override
    public void save(List<Prices> listPrices) {
        if (Objects.nonNull(listPrices)) {
            pricesPersistencePort.saveAll(listPrices);
        }
    }

    @Override
    public Prices findPrices(Instant date, Long productId, Long brandId) {
        return pricesPersistencePort.findByBrandIdAndProductIdAndDateRange(brandId, productId, date);
    }


}
