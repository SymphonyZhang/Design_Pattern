package com.sam.create.factory.abstract_factory.abstractFactoryMethod

import com.sam.entity.Bag
import com.sam.entity.Fruit
import com.sam.entity.bag.OrangeBag
import com.sam.entity.fruit.Orange


class OrangeFactory: AbstractFactory() {
    override fun getFruit(): Fruit = Orange("Peter", 80)

    override fun getBag(): Bag = OrangeBag()
}