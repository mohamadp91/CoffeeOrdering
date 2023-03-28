package com.example.CoffeOrdering.builder

import com.example.CoffeOrdering.models.Customer

class CustomerBuilder() {

    private var id: Long? = null
    private var firstName: String? = null
    private var lastName: String? = null
    private var email: String? = null
    private var address: String? = null
    private var phone: String? = null

    fun id(id: Long) = this.apply { this.id = id }
    fun firstName(firstName: String) = this.apply { this.firstName = firstName }
    fun lastName(lastName: String?) = this.apply { this.lastName = lastName }
    fun email(email: String?) = this.apply { this.email = email }
    fun phone(phone: String) = this.apply { this.phone = phone }
    fun address(address: String) = this.apply { this.address = address }
    fun build() = Customer(
        id ?: throw IllegalArgumentException("id must not be null"),
        firstName ?: throw IllegalArgumentException("firstName must not be null"),
        phone ?: throw IllegalArgumentException("phone must not be null"),
        address ?: throw IllegalArgumentException("address must not be null"),
        lastName,
        email,
    )
}