package com.coffee_shop.coffeeshop.controller;

import com.coffee_shop.coffeeshop.model.CoffeeEntity;
import com.coffee_shop.coffeeshop.service.CoffeeShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CoffeeShop")
public class CoffeeShopController {

    CoffeeShopService coffeeShopService;

    public CoffeeShopController(CoffeeShopService coffeeShopService) {
        this.coffeeShopService = coffeeShopService;
    }

    @GetMapping("{coffeeId}")
    public CoffeeEntity getCoffeeById(@PathVariable("coffeeId") String coffeeId) {
        return coffeeShopService.getCoffeeById(coffeeId);
    }

    @GetMapping()
    public List<CoffeeEntity> getAllCoffees(CoffeeEntity coffeeEntity) {
        return coffeeShopService.getAllCoffees(coffeeEntity);
    }

    @PostMapping()
    public String createCoffee(@RequestBody CoffeeEntity coffeeEntity) {
        return coffeeShopService.createCoffee(coffeeEntity);
    }

    @PutMapping
    public String updateCoffee(@RequestBody CoffeeEntity coffeeEntity) {
        return coffeeShopService.updateCoffee(coffeeEntity);
    }

    @DeleteMapping("{coffeeId}")
    public String deleteCoffee(@PathVariable("coffeeId") String coffeeId) {
        return coffeeShopService.deleteCoffee(coffeeId);
    }
}
