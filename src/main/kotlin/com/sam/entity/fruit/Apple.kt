package com.sam.entity.fruit

import com.sam.action.visit.Visit
import com.sam.entity.Fruit

class Apple(var price: Int = 100) : Fruit {
    override fun price() = price


    override fun draw() = print("苹果红富士")

    override fun accept(visit: Visit) = visit.sell(this) //指针可以传递真实类型

}