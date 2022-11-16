package com.sam.create.factory.factory

import com.sam.create.factory.factory.factoryMethod.AppleFactory


val fruitFactory by lazy{ AppleFactory() }

fun main() {
    peterDo()
    jamesDo()
    lisaDo()

}

fun peterDo(){
    val fruit = fruitFactory.getFruit()
    fruit.draw()
}

fun jamesDo(){
    val fruit = fruitFactory.getFruit()
    fruit.draw()
}

fun lisaDo(){
    val fruit = fruitFactory.getFruit()
    fruit.draw()
}