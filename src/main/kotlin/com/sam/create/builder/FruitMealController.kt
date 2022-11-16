package com.sam.create.builder

class FruitMealController {

    fun construct() {
        //val builder = HolidayBuilder()
        val builder:Builder = OldCustomerBuilder()
        builder.buildApple(120)
        builder.buildBanana(80)
        builder.buildOrange(50)

        val meal = builder.getFruitMeal()
        println("本套餐花费: ${meal.cost()}")
        //meal.showItems()
    }
}




