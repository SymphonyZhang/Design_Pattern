package com.sam.action.observer

fun main() {
    val attentions = MangoAttention()
    attentions.add(CustomerObserver("deer"))
    attentions.add(CustomerObserver("james"))
    attentions.add(CustomerObserver("lison"))
    attentions.add(CustomerObserver("mark"))

    attentions.perform()
}