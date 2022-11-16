package com.sam.action.chain

class NewerMultyDiscount(nextMultyDiscount: MultyDiscount? = null): MultyDiscount(nextMultyDiscount) {
    override fun calculate(money: Int): Int {
        var mMoney = money
        if(mMoney > 100){
            println("首次购优惠减免20")
            mMoney -= 20
        }
        return super.calculate(mMoney)
    }
}