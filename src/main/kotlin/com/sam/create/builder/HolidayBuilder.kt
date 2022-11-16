package com.sam.create.builder

import com.sam.entity.fruit.Apple
import com.sam.entity.fruit.Banana
import com.sam.entity.fruit.Orange


class HolidayBuilder: Builder {
    val meal by lazy { FruitMeal() }
    override fun buildApple(price: Int) {
        val apple = Apple(price)
        meal.apple = apple
    }

    override fun buildBanana(price: Int) {
        val banana = Banana(price)
        meal.banana = banana
    }

    override fun buildOrange(price: Int) {
        val orange = Orange("peter",price)
        meal.orange = orange
    }

    override fun getFruitMeal(): FruitMeal {
        meal.discount = 15
        meal.calculate()
        return meal
    }
}