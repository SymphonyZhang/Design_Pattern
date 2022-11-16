package com.sam.structure.proxy

import com.sam.service.OrderService

fun main() {
    saveOrder()
}

fun saveOrder() {
    val orderService: OrderService = ProxyOrder()
    orderService.saveOrder()
}
