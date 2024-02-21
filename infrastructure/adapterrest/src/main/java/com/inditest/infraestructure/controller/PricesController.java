package com.inditest.infraestructure.controller;


import com.inditest.application.api.PricesService;
import com.inditest.infraestructure.dto.PricesResultDTO;
import com.inditest.infraestructure.mapper.PricesResultMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Objects;

@RestController
@RequestMapping("/prices")
public class PricesController {

    private final PricesService pricesService;

    public PricesController(PricesService pricesService) {
        this.pricesService = pricesService;
    }


    @Operation(summary = "Devuelve el precio a final a aplicar",
            description = "Este metodo buscara en BBDD el precio que se aplicara con los parámetros de entrada"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Encuentra un precio a aplicar"),
            @ApiResponse(responseCode = "404", description = "No Se encuentra un precio a aplicar", content = @Content),
            @ApiResponse(responseCode = "400", description = "Hay algún problema en el envío", content = @Content)
    })
    @GetMapping
    public ResponseEntity<PricesResultDTO> findPrices(
            @Parameter(required = true, description="Fecha que tiene que estar dentro de startDate y endDate", example = "2020-06-14T14:00:00.000Z")
            @RequestParam(name = "date") Instant date,
            @Parameter(required = true, description="Id del Producto a filtrar", example = "35455")
            @RequestParam(name = "productId") Long productId,
            @Parameter(required = true, description="Id del Brand a filtrar",example = "1")
            @RequestParam(name = "brandId") Long brandId
    ) {
        PricesResultDTO prices = PricesResultMapper.toDTO(pricesService.findPrices(date, productId, brandId));
        if (Objects.isNull(prices)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(prices, HttpStatus.OK);
    }

}
