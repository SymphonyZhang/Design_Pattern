package com.sam.action.strategy

interface Discount {
    fun calculate(money: Int): Int
}