package com.coffee_shop.coffeeshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CoffeeShopExceptionHandler {

    @ExceptionHandler(value = {CoffeeShopNotFoundExecption.class})
    public ResponseEntity<Object> handleCoffeeShopNotFoundException
            (CoffeeShopNotFoundExecption coffeeShopNotFoundExecption) {
        CoffeeShopException coffeeShopException = new CoffeeShopException(
            coffeeShopNotFoundExecption.getMessage(),
                coffeeShopNotFoundExecption.getCause(),
                HttpStatus.NOT_FOUND
                );
        return new ResponseEntity<>(coffeeShopException, HttpStatus.NOT_FOUND);
    }
}
