package com.sam.action.command

class ListView(var command: Command) {

    fun getList(){
        println("首页请求")
        val result = command.execute()
        println("当前列表: $result")
    }
}