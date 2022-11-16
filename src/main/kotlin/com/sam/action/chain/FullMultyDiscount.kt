package com.sam.action.chain

//满减优惠
class FullMultyDiscount(nextMultyDiscount: MultyDiscount? = null) : MultyDiscount(nextMultyDiscount) {


    override fun calculate(money: Int): Int {
        var mMoney = money
        if (money > 200) {
            println("优惠满减20元")
            mMoney -= 20
        }

        //可以把下面的封装到抽象类中
        //return nextMultyDiscount?.calculate(money) ?: money
        return super.calculate(mMoney)
    }
}