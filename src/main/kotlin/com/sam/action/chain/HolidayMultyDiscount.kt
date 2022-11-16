package com.sam.action.chain

class HolidayMultyDiscount(nextMultyDiscount: MultyDiscount? = null): MultyDiscount(nextMultyDiscount) {
    override fun calculate(money: Int): Int {
        var mMoney = money
        if(mMoney > 20){
            println("假日一律减5元")
            mMoney -= 5
        }
        return super.calculate(mMoney)
    }
}