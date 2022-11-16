package com.sam.action.template

import com.sam.create.factory.simplefactory.SimpleFactory
import com.sam.entity.Fruit

fun main() {
    val products = mutableListOf<Fruit>()

    products.add(SimpleFactory.getFruitApple())
    products.add(SimpleFactory.getFruitBanana())
    products.add(SimpleFactory.getFruitOrange())

    /*val cart = CartShopping(products)
    cart.submitOrder()*/
    /*val online = OnlineShopping(products)
    online.submitOrder()*/
    /*val cash = CashShopping(products)
    cash.submitOrder()*/
    val other = OtherPayShopping(products)
    other.submitOrder()

}