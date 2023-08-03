package com.coffee_shop.coffeeshop.service;

import com.coffee_shop.coffeeshop.exception.CoffeeShopNotFoundExecption;
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
        if (coffeeShopRepository.findById(coffeeId).isEmpty()) {
            throw new CoffeeShopNotFoundExecption("Can't find Coffee Id");
        }
        return coffeeShopRepository.findById(coffeeId).get();
    }


    @Override
    public List<CoffeeEntity> getAllCoffees(CoffeeEntity coffeeEntity) {
        if (coffeeShopRepository.findAll().isEmpty()) {
            throw new CoffeeShopNotFoundExecption("Don't have any coffee in the database");
        }
        return coffeeShopRepository.findAll();
    }


    @Override
    public String createCoffee(@RequestBody CoffeeEntity coffeeEntity) {
        coffeeShopRepository.save(coffeeEntity);
        return "Created successful!";
    }

    @Override
    public String updateCoffee(@RequestBody CoffeeEntity coffeeEntity) {
        coffeeShopRepository.save(coffeeEntity);
        return "Updated successful";
    }

    @Override
    public String deleteCoffee(String coffeeId) {
        if (coffeeShopRepository.findById(coffeeId).isEmpty()) {
            throw new CoffeeShopNotFoundExecption("Can't find Id to delete");
        }
        coffeeShopRepository.deleteById(coffeeId);
        return "Deleted successful";
    }
}
