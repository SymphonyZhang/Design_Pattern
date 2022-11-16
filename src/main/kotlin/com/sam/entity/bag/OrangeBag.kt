package com.sam.entity.bag

import com.sam.entity.Bag


open class OrangeBag: Bag {
    override fun pack() {
        println("--桔子使用纸箱包装")
    }
}