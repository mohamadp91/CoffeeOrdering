package com.example.CoffeOrdering.repository

import com.example.CoffeOrdering.models.order.Order
import org.springframework.stereotype.Repository

@Repository
class OrderRepository {

    private var _orders : MutableList<Order> = mutableListOf()
    val orders get() = _orders

    fun addOrder(order : Order) {
        _orders.add(order)
    }

}