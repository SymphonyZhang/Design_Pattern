package com.sam.create.factory.abstract_factory.factoryMethod

import com.sam.entity.Fruit


interface FruitFactory {
    fun getFruit(): Fruit
}