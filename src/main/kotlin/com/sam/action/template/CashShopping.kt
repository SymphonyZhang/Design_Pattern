package com.sam.action.template

import com.sam.entity.Fruit

class CashShopping(products:MutableList<Fruit>): ShoppingCart(products) {
    override fun pay(money: Int) {
        println("现金结算, 假一罚十")
    }
}