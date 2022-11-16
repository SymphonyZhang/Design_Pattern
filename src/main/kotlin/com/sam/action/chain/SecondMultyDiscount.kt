package com.sam.action.chain

class SecondMultyDiscount(nextMultyDiscount: MultyDiscount? = null): MultyDiscount(nextMultyDiscount) {
    override fun calculate(money: Int): Int {
        var mMoney = money
        println("第二单9折优惠")
        mMoney = (mMoney * 0.9).toInt()
        return super.calculate(mMoney)
    }
}