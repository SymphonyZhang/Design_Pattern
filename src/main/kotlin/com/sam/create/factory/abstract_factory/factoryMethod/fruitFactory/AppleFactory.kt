package com.sam.create.factory.abstract_factory.factoryMethod.fruitFactory

import com.sam.create.factory.abstract_factory.factoryMethod.FruitFactory
import com.sam.entity.Fruit
import com.sam.entity.fruit.Apple

class AppleFactory : FruitFactory {
    override fun getFruit(): Fruit = Apple()

}