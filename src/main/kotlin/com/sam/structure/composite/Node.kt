package com.sam.structure.composite

abstract class Node(val name: String) {
    abstract fun getChildren(): MutableList<Node>
}