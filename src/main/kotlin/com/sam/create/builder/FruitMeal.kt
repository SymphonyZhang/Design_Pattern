package com.sam.create.builder

import com.sam.entity.fruit.Apple
import com.sam.entity.fruit.Banana
import com.sam.entity.fruit.Orange


class FruitMeal() {

    lateinit var apple: Apple
    lateinit var banana: Banana
    lateinit var orange: Orange
    var discount = 0

    private var totalPrice = 0.0

    fun calculate() {
        if (this::apple.isInitialized) {
            totalPrice += apple.price
        }
        if (this::banana.isInitialized) {
            totalPrice += banana.price
        }
        if (this::orange.isInitialized) {
            totalPrice += orange.price
        }
        if (totalPrice > discount) {
            totalPrice -= discount
        }
    }

    fun cost() = totalPrice

    fun showItems() = println("totalPrice: $totalPrice")

}