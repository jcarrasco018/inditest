package com.inditest.infrastructure.config;

import com.inditest.domain.model.Brand;
import com.inditest.domain.model.PricesBuilder;
import com.inditest.infrastructure.entities.PricesEntity;
import com.inditest.infrastructure.mapper.BrandMapper;
import com.inditest.infrastructure.mapper.PricesMapper;
import com.inditest.infrastructure.repositories.BrandRepository;
import com.inditest.infrastructure.repositories.PricesRepository;
import com.inditest.infrastructure.utils.TimeUtils;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Component
public class PricesInicializer {
    private final PricesRepository pricesRepository;
    private final BrandRepository brandRepository;

    public PricesInicializer(PricesRepository pricesRepository, BrandRepository brandRepository) {
        this.pricesRepository = pricesRepository;
        this.brandRepository = brandRepository;
    }

    @PostConstruct
    public void initData() {
        Brand zaraBrand = new Brand(1L,"ZARA");
        brandRepository.save(Objects.requireNonNull(BrandMapper.toEntity(zaraBrand)));
        List<PricesEntity> list = Stream.of(
                PricesBuilder.builder().brand(zaraBrand).startDate(TimeUtils.getInstant("2020-06-14-00.00.00")).endDate(TimeUtils.getInstant("2020-12-31-23.59.59")).priceList(1L).productId(35455L).priority(0).price(35.50).currency("EUR").build(),
                PricesBuilder.builder().brand(zaraBrand).startDate(TimeUtils.getInstant("2020-06-14-15.00.00")).endDate(TimeUtils.getInstant("2020-06-14-18.30.00")).priceList(2L).productId(35455L).priority(1).price(25.45).currency("EUR").build(),
                PricesBuilder.builder().brand(zaraBrand).startDate(TimeUtils.getInstant("2020-06-15-00.00.00")).endDate(TimeUtils.getInstant("2020-06-15-11.00.00")).priceList(3L).productId(35455L).priority(1).price(30.50).currency("EUR").build(),
                PricesBuilder.builder().brand(zaraBrand).startDate(TimeUtils.getInstant("2020-06-15-16.00.00")).endDate(TimeUtils.getInstant("2020-12-31-23.59.59")).priceList(4L).productId(35455L).priority(1).price(38.95).currency("EUR").build()
        ).map(PricesMapper::toEntity).toList();
        pricesRepository.saveAll(list);
    }
}
