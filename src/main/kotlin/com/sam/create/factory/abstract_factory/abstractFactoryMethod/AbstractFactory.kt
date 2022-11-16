package com.sam.create.factory.abstract_factory.abstractFactoryMethod

import com.sam.entity.Bag
import com.sam.entity.Fruit


abstract class AbstractFactory {
    abstract fun getFruit(): Fruit

    abstract fun getBag(): Bag
}