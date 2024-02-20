package com.inditest.application.config;

import com.inditest.application.adapter.BrandServiceAdapter;
import com.inditest.application.adapter.PricesServiceAdapter;
import com.inditest.application.api.BrandService;
import com.inditest.application.api.PricesService;
import com.inditest.domain.persistence.BrandPersistencePort;
import com.inditest.domain.persistence.PricesPersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public BrandService getBrandService(BrandPersistencePort brandPersistencePort){
        return new BrandServiceAdapter(brandPersistencePort);
    }

    @Bean
    public PricesService getPricesService(PricesPersistencePort pricesPersistencePort){
        return new PricesServiceAdapter(pricesPersistencePort);
    }
}
