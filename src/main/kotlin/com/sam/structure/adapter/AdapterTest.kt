package com.sam.structure.adapter

import com.sam.entity.bag.AppleBag
import com.sam.entity.bag.OrangeBag
import com.sam.entity.fruit.Orange


fun main() {
    val orange = Orange("peter", 100)
    val orangeBag = getBag2()
    orange.pack(orangeBag)
}

//private fun getBag(): OrangeBag = OrangeBag()

private fun getBag2(): OrangeBag {
    val appleBag = AppleBag()
    val orangeBag = OrangeBagAdapter(appleBag)
    return orangeBag
}