package com.sam.structure.decorator

import com.sam.entity.Bag


class CheckedBagDecorator(bag: Bag): BagDecorator(bag) {
    override fun pack() {
        super.pack()
        checked()
    }

    fun checked() {
        println("------------")
        println("打印上防伪标签")
    }

}