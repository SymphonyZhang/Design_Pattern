package com.sam.create.factory.abstract_factory.factoryMethod

import com.sam.create.factory.abstract_factory.abstractFactoryMethod.AppleFactory
import com.sam.create.factory.abstract_factory.factoryMethod.bagFactory.AppleBagFactory


val fruitFactory by lazy { AppleFactory() }
val bagFactory by lazy { AppleBagFactory() }

fun main() {
    pack()
}

fun pack(){
    val fruit = fruitFactory.getFruit()
    fruit.draw()
    val bag = bagFactory.getBag()
    bag.pack()
}