package com.sam.structure.bridge.bag

class MiniBag : BagAbstraction() {
    override fun pick() {
        println("采摘水果开始")
        this.material.draw()
        println("采摘了一迷你型袋")
    }
}