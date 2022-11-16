package com.sam.service.impl

import com.sam.service.OrderService

//本地订单
class OrderServiceImpl: OrderService {
    override fun saveOrder(): Int {
        println("下单成功，订单号: 888888")
        return 888888
    }
}