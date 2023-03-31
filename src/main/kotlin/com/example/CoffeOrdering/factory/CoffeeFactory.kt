package com.example.CoffeOrdering.factory

import com.example.CoffeOrdering.models.coffee.SimpleCoffee
import java.util.*

interface CoffeeFactory {
    fun createCoffee(): SimpleCoffee
}

class EspressoFactory : CoffeeFactory {
    override fun createCoffee(): SimpleCoffee {
        return SimpleCoffee(Random().nextLong(10000000), "Espresso", "Strong and bold", 2.99)
    }
}

class DarkRoastFactory : CoffeeFactory {
    override fun createCoffee(): SimpleCoffee {
        return SimpleCoffee(Random().nextLong(10000000), "Dark Roast", "Sweet and savory", 3.99)
    }
}

class HouseBlendFactory : CoffeeFactory {
    override fun createCoffee(): SimpleCoffee {
        return SimpleCoffee(Random().nextLong(10000000), "House Blend", "Sweet and savory", 3.99)
    }
}

class CappuccinoFactory : CoffeeFactory {
    override fun createCoffee(): SimpleCoffee {
        return SimpleCoffee(Random().nextLong(10000000), "Cappuccino", "Sweet and savory", 3.99)
    }
}

class LatteFactory : CoffeeFactory {
    override fun createCoffee(): SimpleCoffee {
        return SimpleCoffee(Random().nextLong(10000000), "Latte", "Sweet and savory", 3.99)
    }
}

class AmericanoFactory : CoffeeFactory {
    override fun createCoffee(): SimpleCoffee {
        return SimpleCoffee(Random().nextLong(10000000), "Americano", "Sweet and savory", 3.99)
    }
}

class CaffeLatteFactory : CoffeeFactory {
    override fun createCoffee(): SimpleCoffee {
        return SimpleCoffee(Random().nextLong(10000000), "Caffe Latte", "Sweet and savory", 3.99)
    }
}