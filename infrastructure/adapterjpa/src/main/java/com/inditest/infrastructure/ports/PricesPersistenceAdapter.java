package com.inditest.infrastructure.ports;

import com.inditest.domain.model.Prices;
import com.inditest.domain.persistence.PricesPersistencePort;
import com.inditest.infrastructure.mapper.PricesMapper;
import com.inditest.infrastructure.repositories.PricesRepository;

import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PricesPersistenceAdapter implements PricesPersistencePort {

    private final PricesRepository pricesRepository;

    public PricesPersistenceAdapter(PricesRepository pricesRepository) {
        this.pricesRepository = pricesRepository;
    }

    @Override
    public List<Prices> findByBrandIdAndProductIdAndDateRange(Long brandId, Long productId, Instant date) {
        return pricesRepository.findByBrandIdAndProductIdAndDateRange(brandId, productId, date).stream().map(PricesMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void saveAll(List<Prices> listPrices) {
        if (Objects.nonNull(listPrices)) {
            pricesRepository.saveAll(listPrices.stream().map(PricesMapper::toEntity).collect(Collectors.toList()));
        }
    }

    @Override
    public void save(Prices prices) {
        pricesRepository.save(Objects.requireNonNull(PricesMapper.toEntity(prices)));
    }
}
