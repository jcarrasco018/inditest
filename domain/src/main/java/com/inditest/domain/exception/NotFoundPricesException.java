package com.inditest.domain.exception;

import java.io.Serial;

public class NotFoundPricesException extends Exception {

    @Serial
    private static final long serialVersionUID = -8618601744247517166L;

    private final String message;

    public NotFoundPricesException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
