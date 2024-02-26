package com.inditest.domain;

import com.inditest.domain.model.Brand;
import com.inditest.domain.model.Prices;
import com.inditest.domain.model.PricesBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;

public class ModelTest {

    @Test
    public void testPrices(){
        Brand zaraBrand = new Brand(1L,"ZARA");
        Brand zaraBrandDifferent = new Brand(2L,"ZARA");
        Instant date= (new Date()).toInstant();
        Long id = 1L;
        Long priceList = 1L;
        Long productId = 35455L;
        Integer priority=0;
        Double price = 45.0;
        String currency = "EUR";
        Prices prices = PricesBuilder.builder().id(id).brand(zaraBrand).startDate(date).endDate(date).priority(priority).price(price).priceList(priceList).productId(productId).currency(currency).build();
        Prices pricesCopyRef = prices;
        Prices copyPrices = PricesBuilder.builder().id(id).brand(zaraBrand).startDate(date).endDate(date).priority(priority).price(price).priceList(priceList).productId(productId).currency(currency).build();
        Prices copyPricesDifferentBrand = PricesBuilder.builder().id(id).brand(zaraBrandDifferent).startDate(date).endDate(date).priority(priority).price(price).priceList(priceList).productId(productId).currency(currency).build();
        Prices differentPrices =  PricesBuilder.builder().brand(zaraBrand).startDate(date).endDate(date).priceList(priceList).productId(productId).build();
        Assert.assertNotNull(prices);

        Assert.assertEquals(id,prices.getId());
        Assert.assertEquals(zaraBrand,prices.getBrand());
        Assert.assertEquals(date,prices.getStartDate());
        Assert.assertEquals(date,prices.getEndDate());
        Assert.assertEquals(priceList,prices.getPriceList());
        Assert.assertEquals(productId,prices.getProductId());
        Assert.assertEquals(price,prices.getPrice());
        Assert.assertEquals(currency,prices.getCurrency());
        Assert.assertEquals(priority,prices.getPriority());

        Assert.assertNotEquals(prices,differentPrices);
        Assert.assertNotEquals(prices.hashCode(),differentPrices.hashCode());

        Assert.assertEquals(prices,copyPrices);
        Assert.assertEquals(prices.hashCode(),copyPrices.hashCode());

        Assert.assertNotEquals(null,prices);
        Assert.assertNotEquals(prices,null);

        Assert.assertNotEquals(prices, copyPricesDifferentBrand);

        Assert.assertEquals(prices,pricesCopyRef);
        Assert.assertNotEquals(prices,new Prices());
    }

}
