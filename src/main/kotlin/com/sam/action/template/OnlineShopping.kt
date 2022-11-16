package com.sam.action.template

import com.sam.entity.Fruit
import com.sam.service.OrderService
import com.sam.service.impl.OrderServiceImpl

class OnlineShopping(products: MutableList<Fruit>): ShoppingCart(products) {

    private val orderSrvice:OrderService = OrderServiceImpl()

    override fun pay(money: Int) {
        println("微信/支付宝结算, 减免5元, 请支付: ${(money - 5)} 元")
        val orderId = orderSrvice.saveOrder()
    }
}