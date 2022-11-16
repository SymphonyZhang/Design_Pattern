package com.sam.create.factory.abstract_factory.factoryMethod.fruitFactory

import com.sam.create.factory.abstract_factory.factoryMethod.FruitFactory
import com.sam.entity.Fruit
import com.sam.entity.fruit.Banana

class BananaFactory : FruitFactory {
    override fun getFruit(): Fruit = Banana()
}