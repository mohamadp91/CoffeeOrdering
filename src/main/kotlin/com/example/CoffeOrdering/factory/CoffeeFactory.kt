package com.example.CoffeOrdering.factory

import com.example.CoffeOrdering.models.coffee.Coffee
import java.util.*

interface CoffeeFactory {
    fun createCoffee(): Coffee
}

class EspressoFactory : CoffeeFactory {
    override fun createCoffee(): Coffee {
        return Coffee(UUID.randomUUID().timestamp(), "Espresso", "Strong and bold", 2.99)
    }
}

class DarkRoastFactory : CoffeeFactory {
    override fun createCoffee(): Coffee {
        return Coffee(UUID.randomUUID().timestamp(), "Dark Roast", "Sweet and savory", 3.99)
    }
}

class HouseBlendFactory : CoffeeFactory {
    override fun createCoffee(): Coffee {
        return Coffee(UUID.randomUUID().timestamp(), "House Blend", "Sweet and savory", 3.99)
    }
}

class CappuccinoFactory : CoffeeFactory {
    override fun createCoffee(): Coffee {
        return Coffee(UUID.randomUUID().timestamp(), "Cappuccino", "Sweet and savory", 3.99)
    }
}

class LatteFactory : CoffeeFactory {
    override fun createCoffee(): Coffee {
        return Coffee(UUID.randomUUID().timestamp(), "Latte", "Sweet and savory", 3.99)
    }
}

class AmericanoFactory : CoffeeFactory {
    override fun createCoffee(): Coffee {
        return Coffee(UUID.randomUUID().timestamp(), "Americano", "Sweet and savory", 3.99)
    }
}

class CaffeLatteFactory : CoffeeFactory {
    override fun createCoffee(): Coffee {
        return Coffee(UUID.randomUUID().timestamp(), "Caffe Latte", "Sweet and savory", 3.99)
    }
}