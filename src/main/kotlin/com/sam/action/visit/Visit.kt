package com.sam.action.visit

import com.sam.entity.Fruit
import com.sam.entity.fruit.Apple
import com.sam.entity.fruit.Banana
import com.sam.entity.fruit.Orange

class Visit {

    //苹果计价
    fun sell(apple:Apple): Int{
        println("apple's price ￥50")
        return 50
    }

    //桔子计价
    fun sell(orange: Orange): Int{
        println("orange's price ￥20")
        return 20
    }

    //香蕉计价
    fun sell(banana: Banana): Int{
        println("banana's price ￥30")
        return 30
    }

    //其他水果计价
    fun sell(fruit: Fruit): Int{
        println("other's price ￥10")
        return 10
    }

}