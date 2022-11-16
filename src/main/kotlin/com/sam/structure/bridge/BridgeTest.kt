package com.sam.structure.bridge

import com.sam.structure.bridge.bag.SmallBag
import com.sam.structure.bridge.material.Paper

fun main() {
    val bag = SmallBag()
    val material = Paper()
    bag.material = material
    bag.pick()

}