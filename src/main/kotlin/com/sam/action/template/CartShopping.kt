package com.sam.action.template

import com.sam.entity.Fruit

class CartShopping(products: MutableList<Fruit>): ShoppingCart(products) {
    override fun pay(money: Int) {
        println("会员卡结算, 立减10, 金额: ${(money - 10)} ,增加积分: ${(10 * money)}")
    }
}