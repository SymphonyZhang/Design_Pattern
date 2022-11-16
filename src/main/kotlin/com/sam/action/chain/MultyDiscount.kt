package com.sam.action.chain

import com.sam.action.strategy.Discount


abstract class MultyDiscount(var nextMultyDiscount: MultyDiscount? = null) : Discount {

    //abstract override fun calculate(money: Int): Int

    //把一些操作封装到这里
    override fun calculate(money: Int): Int {
        return nextMultyDiscount?.calculate(money) ?: money
    }
}