package com.sam.action.strategy

import com.sam.action.template.OtherPayShopping
import com.sam.create.factory.simplefactory.SimpleFactory
import com.sam.entity.Fruit



fun main() {
    val disCounts = HashMap<String,Discount>()
    disCounts["full"] = FullDiscount()
    disCounts["newer"] = NewerDiscount()
    disCounts["second"] = SecondDiscount()

    val products = mutableListOf<Fruit>()

    products.add(SimpleFactory.getFruitApple())
    products.add(SimpleFactory.getFruitBanana())
    products.add(SimpleFactory.getFruitOrange())

    val cart = OtherPayShopping(products)

    //注入优惠方案
    //cart.mDiscount = FullDiscount()
    //cart.mDiscount = NewerDiscount()
    //cart.mDiscount = SecondDiscount()

    val discount = "full"
    //val discount = "newer"
    //val discount = "second"
    cart.mDiscount = disCounts.getOrDefault(discount,FullDiscount())

    cart.submitOrder()
}