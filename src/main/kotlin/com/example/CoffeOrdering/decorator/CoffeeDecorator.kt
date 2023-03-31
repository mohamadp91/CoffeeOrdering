package com.example.CoffeOrdering.decorator

import com.example.CoffeOrdering.models.coffee.Coffee

abstract class CoffeeDecorator(
    var coffee: Coffee
) : Coffee {
    override fun getCosts(): Double = coffee.getCosts()
}