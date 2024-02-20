package com.inditest.application.api;


import com.inditest.domain.model.Prices;

import java.time.Instant;
import java.util.List;

public interface PricesService {

    void save(Prices prices);

    void save(List<Prices> listPrices);

    Prices findPrices(Instant date, Long productId, Long brandId);
}
