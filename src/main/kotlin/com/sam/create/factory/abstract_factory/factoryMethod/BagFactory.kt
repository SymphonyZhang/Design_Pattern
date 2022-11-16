package com.sam.create.factory.abstract_factory.factoryMethod

import com.sam.entity.Bag


interface BagFactory {
    fun getBag(): Bag
}