package com.sam.structure.decorator

import com.sam.create.factory.abstract_factory.abstractFactoryMethod.AppleFactory

fun main() {
    sendFruit()
}

//结合了抽象工厂模式
fun sendFruit(){
    val factory = AppleFactory()
    //得到水果
    val fruit = factory.getFruit()
    fruit.draw()
    //得到包装
    var bag = factory.getBag()

    //
    bag = CheckedBagDecorator(bag)      //防伪功能
    bag = ReinforceBagDecorator(bag)    //加固功能
    bag = SpeedDecorator(bag)           //加急功能
    bag.pack()




}