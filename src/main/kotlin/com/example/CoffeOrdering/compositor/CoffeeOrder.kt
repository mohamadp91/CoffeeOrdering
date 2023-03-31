package com.example.CoffeOrdering.compositor

import com.example.CoffeOrdering.models.Customer
import com.example.CoffeOrdering.models.coffee.Coffee
import java.time.LocalDateTime

data class CoffeeOrder(
    val id: Long,
    val customer: Customer,
    val items: MutableList<Coffee>,
    val status: OrderStatus,
    val dateCreated: LocalDateTime,
    val dateUpdated: LocalDateTime
) : Coffee {
    override fun getCosts(): Double = items.sumOf { it.getCosts() }

    fun addItem(item: Coffee) {
        items.add(item)
    }

    fun removeItem(item: Coffee) {
        items.remove(item)
    }
}