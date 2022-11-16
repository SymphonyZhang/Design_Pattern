package com.sam.create.singleton

fun main() {
    // 饿汉式调用
    /*val count = SessionCount
    count.plus()
    count.showMessage()
    count.plus()
    count.showMessage()
    count.decrease()
    count.showMessage()*/

    //懒汉式调用
    /*val count = SessionCount.getInstance()
    count.plus()
    count.showMessage()
    count.plus()
    count.showMessage()
    count.decrease()
    count.showMessage()*/

    //双重校验调用
    val count = SessionCount.instance
    count.plus()
    count.showMessage()
    count.plus()
    count.showMessage()
    count.decrease()
    count.showMessage()
}