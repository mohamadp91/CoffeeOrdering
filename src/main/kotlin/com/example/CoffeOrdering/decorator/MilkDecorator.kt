package com.example.CoffeOrdering.decorator

import com.example.CoffeOrdering.models.coffee.Coffee

class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun getCosts(): Double {
        return super.getCosts() + 1.0
    }
}