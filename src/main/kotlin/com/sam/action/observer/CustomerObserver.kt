package com.sam.action.observer

class CustomerObserver(val name:String): Observer {

    override fun update() {
        println("$name 购买青芒")
    }
}