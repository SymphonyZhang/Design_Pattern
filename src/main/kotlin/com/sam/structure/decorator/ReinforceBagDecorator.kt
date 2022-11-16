package com.sam.structure.decorator

import com.sam.entity.Bag


class ReinforceBagDecorator(bag: Bag): BagDecorator(bag) {
    override fun pack() {
        super.pack()
        reinforce()
    }

    fun reinforce() {
        println("------------")
        println("加固了包装")
    }
}