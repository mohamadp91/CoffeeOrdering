package com.example.CoffeOrdering.services

import com.example.CoffeOrdering.compositor.CoffeeOrder
import com.example.CoffeOrdering.compositor.OrderStatus
import com.example.CoffeOrdering.factory.*
import com.example.CoffeOrdering.models.Customer
import com.example.CoffeOrdering.models.coffee.CoffeeTypes
import com.example.CoffeOrdering.models.coffee.CoffeeTypes.*
import com.example.CoffeOrdering.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class CoffeeShop private constructor() {

    @Autowired
    private lateinit var orderRepository: OrderRepository
    private val espressoFactory by lazy {
        EspressoFactory()
    }
    private val darkRoastFactory by lazy {
        DarkRoastFactory()
    }
    private val houseBlendFactory by lazy {
        HouseBlendFactory()
    }
    private val cappuccinoFactory by lazy {
        CappuccinoFactory()
    }
    private val latteFactory by lazy {
        LatteFactory()
    }
    private val americanoFactory by lazy {
        AmericanoFactory()
    }
    private val caffeLatteFactory by lazy {
        CaffeLatteFactory()
    }

    fun getCoffees(): List<String> = values().map { it.name }
    fun orderCoffee(
        customer: Customer,
        coffees: List<String>
    ) {
        val coffeeTypes = coffees.map { CoffeeTypes.valueOf(it) }
        val coffeeList = coffeeTypes.map {
            when (it) {
                Espresso -> espressoFactory.createCoffee()
                DarkRoast -> darkRoastFactory.createCoffee()
                HouseBlend -> houseBlendFactory.createCoffee()
                Cappuccino -> cappuccinoFactory.createCoffee()
                Latte -> latteFactory.createCoffee()
                Americano -> americanoFactory.createCoffee()
                CaffeLatte -> caffeLatteFactory.createCoffee()
            }
        }
        val coffeeOrder = CoffeeOrder(
            id = Random().nextLong(100000),
            customer,
            coffeeList.toMutableList(),
            OrderStatus.IN_PROGRESS,
            LocalDateTime.now(),
            LocalDateTime.now()
        )
        orderRepository.addOrder(coffeeOrder)
    }

    fun getOrders(): List<CoffeeOrder> = orderRepository.orders

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