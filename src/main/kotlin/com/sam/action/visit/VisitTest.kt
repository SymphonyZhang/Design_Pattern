package com.sam.action.visit

import com.sam.create.factory.simplefactory.SimpleFactory
import com.sam.entity.Fruit
import com.sam.entity.fruit.Apple

val list = mutableListOf<Fruit>()

fun init(){
    list.add(SimpleFactory.getFruitApple())
    list.add(SimpleFactory.getFruitBanana())
    list.add(SimpleFactory.getFruitOrange())
}

fun price():Int{
    var total = 0
    for (fruit in list) {
        //total += visit.sell(fruit)
        total += fruit.accept(visit)
    }
    println("总价值: $total")
    return total
}

val visit = Visit()

fun main() {
    init()
    price()
    //test1()
    //test2()
}

private fun test1(){
    val apple:Apple = Apple()
    val fruit:Fruit = apple

    var price = visit.sell(fruit)// 不能识别fruit对象的真实类型
    println("fruit价格: $price")

    price = visit.sell(apple)
    println("Apple价格: $price")
}

private fun test2(){
    val apple:Apple = Apple()
    val fruit:Fruit = apple

    val price = fruit.accept(visit)

    println("价格: $price")
}

