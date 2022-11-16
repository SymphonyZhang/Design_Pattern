package com.sam.entity.fruit

import com.sam.action.visit.Visit
import com.sam.entity.Bag
import com.sam.entity.Fruit

class Orange(val name:String,var price: Int = 70): Fruit {
    override fun price() = price

    override fun draw() = print("沙糖桔")

    override fun accept(visit: Visit) = visit.sell(this)

    fun pack(bag: Bag) {
        print("桔子 -> ")
        bag.pack()
    }
}