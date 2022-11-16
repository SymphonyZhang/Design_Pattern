package com.sam.action.observer.jdk

import java.util.*

class Customer(val name: String) : Observer {
    override fun update(o: Observable?, arg: Any?) {
        println("jdk -> $name 购买青芒")
    }
}