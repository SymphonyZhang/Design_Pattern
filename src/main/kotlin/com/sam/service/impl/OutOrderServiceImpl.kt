package com.sam.service.impl

import com.sam.service.OrderService

// 海外订单
class OutOrderServiceImpl : OrderService {
    override fun saveOrder(): Int {
        println("下单成功, 订单号: 66666666")
        return 66666666
    }
}