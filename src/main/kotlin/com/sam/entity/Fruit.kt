package com.sam.entity

import com.sam.action.visit.Visit

interface Fruit {
    fun price():Int

    fun draw()

    fun accept(visit: Visit): Int
}