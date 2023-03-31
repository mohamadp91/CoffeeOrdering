package com.example.CoffeOrdering.repository

import com.example.CoffeOrdering.compositor.CoffeeOrder
import org.springframework.stereotype.Repository

@Repository
class OrderRepository {

    private var _Coffee_orders : MutableList<CoffeeOrder> = mutableListOf()
    val orders get() = _Coffee_orders

    fun addOrder(coffeeOrder : CoffeeOrder) {
        _Coffee_orders.add(coffeeOrder)
    }

}