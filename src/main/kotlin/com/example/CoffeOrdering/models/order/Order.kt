package com.example.CoffeOrdering.models.order

import com.example.CoffeOrdering.models.Customer
import com.example.CoffeOrdering.models.coffee.Coffee
import java.time.LocalDateTime

data class Order(
    val id: Long,
    val customer: Customer,
    val items: List<Coffee>,
    val status: OrderStatus,
    val dateCreated: LocalDateTime,
    val dateUpdated: LocalDateTime
)