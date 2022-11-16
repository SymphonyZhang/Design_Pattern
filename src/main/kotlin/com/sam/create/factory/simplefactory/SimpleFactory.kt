package com.sam.create.factory.simplefactory

import com.sam.entity.fruit.Apple
import com.sam.entity.fruit.Banana
import com.sam.entity.fruit.Orange

class SimpleFactory {

    companion object{
        //以类型作为判断，单一方法作为返回 单工厂
        const val TYPE_APPLE = 1
        const val TYPE_ORANGE = 2
        const val TYPE_BANANA = 3

        fun getFruit(type: Int) = when(type){
            TYPE_APPLE -> Apple()
            TYPE_ORANGE -> Orange("Peter",80)
            TYPE_BANANA -> Banana()
            else -> null
        }

        // 多工厂方式
        fun getFruitApple() = Apple()

        fun getFruitOrange() = Orange("Peter",80)

        fun getFruitBanana() = Banana()
    }


}