package com.inditest;


import com.inditest.infraestructure.dto.PricesResultDTO;
import com.inditest.infrastructure.utils.TimeUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IndiTestApplicationTests {

    @LocalServerPort
    private int puerto;

    @Value("${server.contextPath}")
    private String contextPath;

    private final TestRestTemplate restTemplate = new TestRestTemplate();

    /**
     * Petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    void test1() {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString("http://localhost:".concat(String.valueOf(puerto)).concat(contextPath))
                .pathSegment("prices");
        uriBuilder.queryParam("date", TimeUtils.getInstant("2020-06-14-10.00.00"));
        uriBuilder.queryParam("productId", 35455L);
        uriBuilder.queryParam("brandId", 1L);

        ResponseEntity<PricesResultDTO> respuesta = restTemplate.getForEntity(uriBuilder.toUriString(), PricesResultDTO.class);

        assertNotNull(respuesta);
        assertEquals(HttpStatus.OK, respuesta.getStatusCode());
        assertNotNull(respuesta.getBody());
        assertThat(respuesta.getBody()).isNotNull();
        PricesResultDTO prices = new PricesResultDTO(35455L, 1L, 35.5, "EUR", 1L, TimeUtils.getInstant("2020-06-14-00.00.00"), TimeUtils.getInstant("2020-12-31-23.59.59"));
        assertEquals(prices, respuesta.getBody());

    }

    /**
     * Petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    void test2() {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString("http://localhost:".concat(String.valueOf(puerto)).concat(contextPath))
                .pathSegment("prices");
        uriBuilder.queryParam("date", TimeUtils.getInstant("2020-06-14-16.00.00"));
        uriBuilder.queryParam("productId", 35455L);
        uriBuilder.queryParam("brandId", 1L);

        ResponseEntity<PricesResultDTO> respuesta = restTemplate.getForEntity(uriBuilder.toUriString(), PricesResultDTO.class);

        assertNotNull(respuesta);
        assertEquals(HttpStatus.OK, respuesta.getStatusCode());
        assertNotNull(respuesta.getBody());
        assertThat(respuesta.getBody()).isNotNull();
        PricesResultDTO prices = new PricesResultDTO(35455L, 1L, 25.45, "EUR", 2L, TimeUtils.getInstant("2020-06-14-15.00.00"), TimeUtils.getInstant("2020-06-14-18.30.00"));
        assertEquals(prices, respuesta.getBody());
    }

    /**
     * Petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    void test3() {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString("http://localhost:".concat(String.valueOf(puerto)).concat(contextPath))
                .pathSegment("prices");
        uriBuilder.queryParam("date", TimeUtils.getInstant("2020-06-14-21.00.00"));
        uriBuilder.queryParam("productId", 35455L);
        uriBuilder.queryParam("brandId", 1L);

        ResponseEntity<PricesResultDTO> respuesta = restTemplate.getForEntity(uriBuilder.toUriString(), PricesResultDTO.class);

        assertNotNull(respuesta);
        assertEquals(HttpStatus.OK, respuesta.getStatusCode());
        assertNotNull(respuesta.getBody());
        assertThat(respuesta.getBody()).isNotNull();
        PricesResultDTO prices = new PricesResultDTO(35455L, 1L, 35.5, "EUR", 1L, TimeUtils.getInstant("2020-06-14-00.00.00"), TimeUtils.getInstant("2020-12-31-23.59.59"));
        assertEquals(prices, respuesta.getBody());

    }

    /**
     * Petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    void test4() {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString("http://localhost:".concat(String.valueOf(puerto)).concat(contextPath))
                .pathSegment("prices");
        uriBuilder.queryParam("date", TimeUtils.getInstant("2020-06-15-10.00.00"));
        uriBuilder.queryParam("productId", 35455L);
        uriBuilder.queryParam("brandId", 1L);

        ResponseEntity<PricesResultDTO> respuesta = restTemplate.getForEntity(uriBuilder.toUriString(), PricesResultDTO.class);

        assertNotNull(respuesta);
        assertEquals(HttpStatus.OK, respuesta.getStatusCode());
        assertNotNull(respuesta.getBody());
        assertThat(respuesta.getBody()).isNotNull();
        PricesResultDTO prices = new PricesResultDTO(35455L, 1L, 30.50, "EUR", 3L, TimeUtils.getInstant("2020-06-15-00.00.00"), TimeUtils.getInstant("2020-06-15-11.00.00"));
        assertEquals(prices, respuesta.getBody());

    }

    /**
     * Petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    void test5() {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString("http://localhost:".concat(String.valueOf(puerto)).concat(contextPath))
                .pathSegment("prices");
        uriBuilder.queryParam("date", TimeUtils.getInstant("2020-06-16-21.00.00"));
        uriBuilder.queryParam("productId", 35455L);
        uriBuilder.queryParam("brandId", 1L);

        ResponseEntity<PricesResultDTO> respuesta = restTemplate.getForEntity(uriBuilder.toUriString(), PricesResultDTO.class);

        assertNotNull(respuesta);
        assertEquals(HttpStatus.OK, respuesta.getStatusCode());
        assertNotNull(respuesta.getBody());
        assertThat(respuesta.getBody()).isNotNull();
        PricesResultDTO prices = new PricesResultDTO(35455L, 1L, 38.95, "EUR", 4L, TimeUtils.getInstant("2020-06-15-16.00.00"), TimeUtils.getInstant("2020-12-31-23.59.59"));
        assertEquals(prices, respuesta.getBody());

    }



    /**
     * Petición sin un parametro para dar 400
     */
    @Test
    void testBadRequest() {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString("http://localhost:".concat(String.valueOf(puerto)).concat(contextPath))
                .pathSegment("prices");
        uriBuilder.queryParam("productId", 35455L);
        uriBuilder.queryParam("brandId", 1L);

        ResponseEntity<PricesResultDTO> respuesta = restTemplate.getForEntity(uriBuilder.toUriString(), PricesResultDTO.class);

        assertNotNull(respuesta);
        assertEquals(HttpStatus.BAD_REQUEST, respuesta.getStatusCode());

    }

    /**
     * Petición sin un parametro para dar 400
     */
    @Test
    void testNotFound() {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString("http://localhost:".concat(String.valueOf(puerto)).concat(contextPath))
                .pathSegment("prices");
        uriBuilder.queryParam("date", TimeUtils.getInstant("2020-01-16-21.00.00"));
        uriBuilder.queryParam("productId", 35455L);
        uriBuilder.queryParam("brandId", 1L);

        ResponseEntity<PricesResultDTO> respuesta = restTemplate.getForEntity(uriBuilder.toUriString(), PricesResultDTO.class);

        assertNotNull(respuesta);
        assertEquals(HttpStatus.NOT_FOUND, respuesta.getStatusCode());

    }


}
