package com.sam.action.template

import com.sam.action.strategy.Discount
import com.sam.entity.Fruit


abstract class ShoppingCart(val products: MutableList<Fruit>) {

    // 策略模式
    lateinit var mDiscount: Discount

    //提交订单
    fun submitOrder() {
        //计算商品金额
        var money = blance()
        println("需要支付总金额为: $money 元")

        //策略模式使用的地方
        //优惠减免
        if (::mDiscount.isInitialized) {
            money = mDiscount.calculate(money)
            println("优惠减免后: $money 元")
        }

        //保存订单
        pay(money)

        //送货上门
        sendHome()
    }

    fun blance(): Int {
        var money = 0
        println("商品清单: ")
        for (fruit in products) {
            fruit.draw()
            print(",")
            money += fruit.price()
        }
        return money
    }

    fun sendHome() = println("三公里以内, 免费送货上门")

    abstract fun pay(money: Int)
}
