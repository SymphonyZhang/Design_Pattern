package com.sam.structure.proxy

import com.sam.service.OrderService
import com.sam.service.impl.OutOrderServiceImpl

// 代理订单服务
class ProxyOrder : OrderService {

    //真实的订单服务
    private val orderService = OutOrderServiceImpl()

    override fun saveOrder(): Int {
        println("开始海外订单")
        return orderService.saveOrder()
    }
}