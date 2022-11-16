package com.sam.entity.fruit

import com.sam.action.visit.Visit
import com.sam.entity.Fruit

class Banana(var price: Int = 60): Fruit {
    override fun price() = price

    override fun draw() = print("仙人蕉")

    override fun accept(visit: Visit) = visit.sell(this)
}