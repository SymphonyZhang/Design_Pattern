package com.sam.create.factory.abstract_factory.factoryMethod.bagFactory

import com.sam.create.factory.abstract_factory.factoryMethod.BagFactory
import com.sam.entity.Bag
import com.sam.entity.bag.BananaBag

class BananaBagFactory : BagFactory {
    override fun getBag(): Bag = BananaBag()
}