package com.sam.create.factory.abstract_factory

import com.sam.create.factory.abstract_factory.abstractFactoryMethod.OrangeFactory


val factory by lazy { OrangeFactory() }

fun main() {
    pack()
}

fun pack(){
    val fruit = factory.getFruit()
    fruit.draw()
    val bag = factory.getBag()
    bag.pack()
}