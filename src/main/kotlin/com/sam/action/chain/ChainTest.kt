package com.sam.action.chain

import com.sam.action.template.OtherPayShopping
import com.sam.create.factory.simplefactory.SimpleFactory
import com.sam.entity.Fruit

fun main() {

    var multyDiscount:MultyDiscount = FullMultyDiscount()
    multyDiscount = NewerMultyDiscount(multyDiscount)
    multyDiscount = SecondMultyDiscount(multyDiscount)
    multyDiscount = HolidayMultyDiscount(multyDiscount)


    val products = mutableListOf<Fruit>()

    products.add(SimpleFactory.getFruitApple())
    products.add(SimpleFactory.getFruitBanana())
    products.add(SimpleFactory.getFruitOrange())
    products.add(SimpleFactory.getFruitApple())

    val cart = OtherPayShopping(products)

    //注入优惠方案
    cart.mDiscount = multyDiscount

    cart.submitOrder()
}