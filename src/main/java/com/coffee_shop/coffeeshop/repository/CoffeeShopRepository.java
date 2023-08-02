package com.coffee_shop.coffeeshop.repository;

import com.coffee_shop.coffeeshop.model.CoffeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeShopRepository extends JpaRepository<CoffeeEntity, String> {

}
