package com.sam.structure.bridge.bag

import com.sam.structure.bridge.material.Material

abstract class BagAbstraction {
    lateinit var material: Material

    abstract fun pick()
}