package com.example.CoffeOrdering.controller

import com.example.CoffeOrdering.builder.CustomerBuilder
import com.example.CoffeOrdering.compositor.CoffeeOrder
import com.example.CoffeOrdering.services.CoffeeShop
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import kotlin.random.Random

@RestController
@RequestMapping("/api/coffee/")
class CoffeeController {

    @Autowired
    private lateinit var coffeeShop: CoffeeShop

    @GetMapping("menu")
    fun getAllCoffees(): List<String> = coffeeShop.getCoffees()

    @GetMapping("orders")
    fun getOrders(): List<CoffeeOrder> = coffeeShop.getOrders()

    @PostMapping("order/{coffees}")
    fun orderCoffee(
        @RequestParam firstName: String,
        @RequestParam phone: String,
        @RequestParam address: String,
        @RequestParam lastName: String,
        @RequestParam email: String,
        @PathVariable coffees: String
    ) {
        val customer = CustomerBuilder()
            .id(Random.nextLong(100000))
            .firstName(firstName)
            .address(address)
            .lastName(lastName)
            .email(email)
            .phone(phone)
            .build()

        coffeeShop.orderCoffee(
            customer,
            coffees.split(",").toList()
        )
    }

}