package com.sam.create.factory.factory.factoryMethod

import com.sam.entity.fruit.Banana


class BananaFactory : FruitFactory {
    override fun getFruit() = Banana()
}