package com.sam.create.singleton

import java.util.concurrent.atomic.AtomicInteger

/**
 * 饿汉式单例
 */
/*
object SessionCount {
    private val count:AtomicInteger = AtomicInteger(0)

    fun plus():Int = count.incrementAndGet()

    fun decrease():Int = count.decrementAndGet()

    fun showMessage() = println("当前人数: ${count.get()}")

}*/

/**
 * 懒汉式单例
 */
/*
class SessionCount private constructor(){
    private val count:AtomicInteger = AtomicInteger(0)
    companion object{
        private var mInstance:SessionCount? = null
            get() {
                if(field == null){
                    field = SessionCount()
                }
                return field
            }

        @Synchronized //线程安全
        fun getInstance() = mInstance!!
    }

    fun plus():Int = count.incrementAndGet()

    fun decrease():Int = count.decrementAndGet()

    fun showMessage() = println("当前人数: ${count.get()}")
}*/

/**
 * 双重校验单例
 */

class SessionCount private constructor(){
    private val count:AtomicInteger = AtomicInteger(0)
    companion object{
        val instance by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED){
            SessionCount()
        }
    }

    fun plus():Int = count.incrementAndGet()

    fun decrease():Int = count.decrementAndGet()

    fun showMessage() = println("当前人数: ${count.get()}")
}
