package com.sam.structure.facade

import com.sam.create.factory.abstract_factory.abstractFactoryMethod.AppleFactory
import com.sam.structure.decorator.CheckedBagDecorator
import com.sam.structure.decorator.ReinforceBagDecorator
import com.sam.structure.decorator.SpeedDecorator

//包装服务
class PackService {

    /**
     * 水果打包： 防伪/加固/加急等
     */
    fun doPack(){
        val factory = AppleFactory()

        //得到包装
        var bag = factory.getBag()

        //进行装饰 增加防伪标识等
        bag = CheckedBagDecorator(bag)      // 防伪
        bag = ReinforceBagDecorator(bag)    // 加速
        bag = SpeedDecorator(bag)           // 加急

        bag.pack()
    }

    fun doOther(){
        println("其他服务")
    }
}