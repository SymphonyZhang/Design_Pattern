package com.sam.create.factory.factory.factoryMethod

import com.sam.entity.fruit.Orange


class OrangeFactory : FruitFactory {
    override fun getFruit() = Orange("Peter", 80)
}