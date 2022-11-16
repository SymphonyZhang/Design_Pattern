package com.sam.action.observer

abstract class Attentions {
    //关注客户列表
    var observers = mutableListOf<Observer>()

    //关注顾客
    fun add(observer: Observer) = observers.add(observer)

    //取消关注
    fun remove(observer: Observer) = observers.remove(observer)

    //发通知
    abstract fun notifyObservers()
}