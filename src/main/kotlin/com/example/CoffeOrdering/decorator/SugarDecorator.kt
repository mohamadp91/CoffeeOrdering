package com.example.CoffeOrdering.decorator

import com.example.CoffeOrdering.models.coffee.Coffee

class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun getCosts(): Double {
        return super.getCosts() + 0.25
    }
}