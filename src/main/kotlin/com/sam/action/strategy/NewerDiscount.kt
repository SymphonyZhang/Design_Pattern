package com.sam.action.strategy

// 首次购
class NewerDiscount : Discount {
    override fun calculate(money: Int): Int {
        if (money > 100) {
            println("首次购优惠减免20")
            return money - 20
        }
        return money
    }
}