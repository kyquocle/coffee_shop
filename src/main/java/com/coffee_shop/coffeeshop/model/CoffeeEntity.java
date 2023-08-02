package com.coffee_shop.coffeeshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Coffee_Infor")
public class CoffeeEntity {

    @Id
    private String coffeeId;
    private String coffeeName;
    public String coffeePrice;
    private String coffeeBrand;

    public CoffeeEntity() {
    }

    public CoffeeEntity(String coffeeId, String coffeeName, String coffeePrice, String coffeeBrand) {
        this.coffeeId = coffeeId;
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.coffeeBrand = coffeeBrand;
    }

    public String getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(String coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(String coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public String getCoffeeBrand() {
        return coffeeBrand;
    }

    public void setCoffeeBrand(String coffeeBrand) {
        this.coffeeBrand = coffeeBrand;
    }
}
