package com.sam.structure.bridge.bag

class BigBag : BagAbstraction() {
    override fun pick() {
        println("采摘水果开始")
        this.material.draw()
        println("采摘了一大型袋")
    }
}