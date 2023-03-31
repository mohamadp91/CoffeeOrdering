package  com.example.CoffeOrdering.models.coffee

data class SimpleCoffee(
    val id: Long,
    val name: String,
    val description: String,
    val price: Double
) : Coffee {
        override fun getCosts(): Double = price
}