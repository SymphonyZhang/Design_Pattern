package com.sam.structure.decorator

import com.sam.entity.Bag


open class BagDecorator(var bag: Bag):Bag {

    override fun pack() {
        bag.pack()
    }
}