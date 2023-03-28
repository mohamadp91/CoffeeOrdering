package com.example.CoffeOrdering.models

data class Customer(
    var id: Long,
    var firstName: String,
    var phone: String,
    var address: String,
    var lastName: String? = null,
    var email: String? = null,
)
