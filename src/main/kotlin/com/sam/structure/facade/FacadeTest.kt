package com.sam.structure.facade

fun main() {
    //doOrder()
    doOrderFacade()
}

// 一般调用，需要知道每个服务的详细情况，防止调用了错误的方法
fun doOrder() {
    val pickService = PickService()
    val packService = PackService()
    val sendService = SendService()

    //采摘
    println("---------------")
    pickService.doPick()
    println("---------------")
    packService.doPack()
    println("---------------")
    sendService.doSend()
}

//使用外观模式，不用知道每个服务的详细情况
fun doOrderFacade(){
    val orderFacade = OrderFacade()
    orderFacade.doOrder()
}
