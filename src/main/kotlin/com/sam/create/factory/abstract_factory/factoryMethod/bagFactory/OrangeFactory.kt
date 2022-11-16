package com.sam.create.factory.abstract_factory.factoryMethod.bagFactory

import com.sam.create.factory.abstract_factory.factoryMethod.BagFactory
import com.sam.entity.Bag
import com.sam.entity.bag.OrangeBag


class OrangeFactory : BagFactory {
    override fun getBag(): Bag = OrangeBag()
}