package com.sam.action.strategy

// 第二单9折优惠
class SecondDiscount : Discount {
    override fun calculate(money: Int): Int {
        println("第二单9折优惠")
        val balance = money * 0.9
        return balance.toInt()
    }
}