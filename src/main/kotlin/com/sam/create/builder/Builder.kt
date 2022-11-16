package com.sam.create.builder

interface Builder {
    fun buildApple(price: Int)
    fun buildBanana(price: Int)
    fun buildOrange(price: Int)
    fun getFruitMeal(): FruitMeal
}