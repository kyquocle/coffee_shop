package com.coffee_shop.coffeeshop.exception;

public class CoffeeShopNotFoundExecption extends RuntimeException{

    public CoffeeShopNotFoundExecption(String message) {
        super(message);
    }

    public CoffeeShopNotFoundExecption(String message, Throwable cause) {
        super(message, cause);
    }
}
