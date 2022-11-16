package com.sam.action.strategy

// 满减
class FullDiscount : Discount {
    override fun calculate(money: Int): Int {
        if (money > 200) {
            println("优惠满200减免20元")
            return money - 20
        }
        return money
    }
}