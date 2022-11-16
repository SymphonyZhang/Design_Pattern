package com.sam.create.factory.factory.factoryMethod

import com.sam.entity.fruit.Apple


class AppleFactory : FruitFactory {
    override fun getFruit() = Apple()

}