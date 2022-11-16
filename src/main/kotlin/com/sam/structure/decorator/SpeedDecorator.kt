package com.sam.structure.decorator

import com.sam.entity.Bag


class SpeedDecorator(bag: Bag):BagDecorator(bag) {

    override fun pack() {
        super.pack()
        speedy()
    }

    private fun speedy() {
        println("------------")
        println("快递大哥, 请加急邮送")
    }
}