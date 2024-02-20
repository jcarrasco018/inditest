package com.inditest.infrastructure.config;


import com.inditest.domain.persistence.BrandPersistencePort;
import com.inditest.domain.persistence.PricesPersistencePort;
import com.inditest.infrastructure.ports.BrandPersistenceAdapter;
import com.inditest.infrastructure.ports.PricesPersistenceAdapter;
import com.inditest.infrastructure.repositories.BrandRepository;
import com.inditest.infrastructure.repositories.PricesRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDataJpaAdapterConfiguration {
    @Bean
    public BrandPersistencePort getBrandPersitencePort(BrandRepository brandRepository) {
        return new BrandPersistenceAdapter(brandRepository);
    }

    @Bean
    public PricesPersistencePort getPricesPersistenecPort(PricesRepository pricesRepository) {
        return new PricesPersistenceAdapter(pricesRepository);
    }
}
