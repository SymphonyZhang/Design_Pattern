package com.sam.create.factory.abstract_factory.abstractFactoryMethod

import com.sam.entity.Bag
import com.sam.entity.Fruit
import com.sam.entity.bag.AppleBag
import com.sam.entity.fruit.Apple


class AppleFactory: AbstractFactory() {
    override fun getFruit(): Fruit = Apple()

    override fun getBag(): Bag = AppleBag()
}