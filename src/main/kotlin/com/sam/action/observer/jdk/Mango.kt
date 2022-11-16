package com.sam.action.observer.jdk

import java.util.Observable

class Mango(val name: String) : Observable() {

    fun perform(){
        this.setChanged()
        this.notifyObservers()
    }

}