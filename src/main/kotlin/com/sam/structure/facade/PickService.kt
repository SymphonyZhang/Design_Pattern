package com.sam.structure.facade

import com.sam.structure.bridge.bag.SmallBag
import com.sam.structure.bridge.material.Paper

//采摘服务
class PickService {

    fun doPick(){
        //袋子型号
        val pickBag = SmallBag()

        //袋子材质
        val material = Paper()
        pickBag.material =material

        //开始采摘
        pickBag.pick()
    }

    fun doOther(){
        println("其他服务")
    }
}