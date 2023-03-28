package com.example.CoffeOrdering.services

import com.example.CoffeOrdering.models.coffee.CoffeeTypes
import com.example.CoffeOrdering.models.order.Order
import com.example.CoffeOrdering.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CoffeeShop private constructor() {

    @Autowired
    private lateinit var orderRepository: OrderRepository

    fun getCoffees(): List<String> = CoffeeTypes.values().map { it.name }
    fun orderCoffee(order: Order) {
        orderRepository.addOrder(order)
    }

    fun getOrders(): List<Order> = orderRepository.orders

    companion object {
        @Volatile
        private var coffeeShop: CoffeeShop? = null

        fun getInstance(): CoffeeShop {
            return coffeeShop ?: synchronized(this) {
                coffeeShop ?: CoffeeShop().also { coffeeShop = it }
            }
        }
    }
}