package com.sam.structure.facade

class OrderFacade {

    val pickService = PickService()
    val packService = PackService()
    val sendService = SendService()

    fun doOrder(){
        println("---------------")
        pickService.doPick()
        println("---------------")
        packService.doPack()
        println("---------------")
        sendService.doSend()
    }
}