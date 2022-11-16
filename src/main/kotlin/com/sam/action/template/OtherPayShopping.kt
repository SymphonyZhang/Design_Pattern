package com.sam.action.template

import com.sam.entity.Fruit

class OtherPayShopping(products:MutableList<Fruit>): ShoppingCart(products) {
    override fun pay(money: Int) {
        println("代付成功")
    }
}