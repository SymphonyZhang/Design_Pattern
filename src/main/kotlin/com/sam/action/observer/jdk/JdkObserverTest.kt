package com.sam.action.observer.jdk

fun main() {
    val mango = Mango("芒果")

    mango.addObserver(Customer("deer"))
    mango.addObserver(Customer("james"))
    mango.addObserver(Customer("lison"))
    mango.addObserver(Customer("mark"))

    mango.perform()
}