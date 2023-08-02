package com.coffee_shop.coffeeshop.service;

import com.coffee_shop.coffeeshop.model.CoffeeEntity;
import com.coffee_shop.coffeeshop.repository.CoffeeShopRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CoffeeShopServiceImpl implements CoffeeShopService{

    CoffeeShopRepository coffeeShopRepository;

    public CoffeeShopServiceImpl(CoffeeShopRepository coffeeShopRepository) {
        this.coffeeShopRepository = coffeeShopRepository;
    }

    @Override
    public CoffeeEntity getCoffeeById(String coffeeId) {
        return coffeeShopRepository.findById(coffeeId).get();
    }


    @Override
    public List<CoffeeEntity> getAllCoffees(CoffeeEntity coffeeEntity) {
        return coffeeShopRepository.findAll();
    }


    @Override
    public String createCoffee(@RequestBody CoffeeEntity coffeeEntity) {
        coffeeShopRepository.save(coffeeEntity);
        return "Created successful!";
    }

    @Override
    public String updateCoffee(CoffeeEntity coffeeEntity) {
        coffeeShopRepository.save(coffeeEntity);
        return "Updated successful";
    }

    @Override
    public String deleteCoffee(String coffeeId) {
        coffeeShopRepository.deleteById(coffeeId);
        return "Deleted successful";
    }
}
