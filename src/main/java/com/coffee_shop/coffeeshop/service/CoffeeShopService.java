package com.coffee_shop.coffeeshop.service;

import com.coffee_shop.coffeeshop.model.CoffeeEntity;

import java.util.List;

public interface CoffeeShopService {
    public CoffeeEntity getCoffeeById(String coffeeId);
    public List<CoffeeEntity> getAllCoffees(CoffeeEntity coffeeEntity);
    public String createCoffee(CoffeeEntity coffeeEntity);
    public String updateCoffee(CoffeeEntity coffeeEntity);
    public String deleteCoffee(String coffeeId);
}
