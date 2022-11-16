package com.sam.action.observer

class MangoAttention:Attentions() {

    override fun notifyObservers() {
        for (obs in observers) {
            obs.update()
        }
    }

    fun perform(){
        this.notifyObservers()
    }
}