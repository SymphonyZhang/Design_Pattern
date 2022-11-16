package com.sam.create.factory.abstract_factory.abstractFactoryMethod

import com.sam.entity.Bag
import com.sam.entity.Fruit
import com.sam.entity.bag.BananaBag
import com.sam.entity.fruit.Banana


class BananaFactory: AbstractFactory() {
    override fun getFruit(): Fruit = Banana()

    override fun getBag(): Bag = BananaBag()
}