package com.sam.structure.composite

class DistrictNode(name: String): Node(name) {

    val mChildren = mutableListOf<Node>()

    override fun getChildren(): MutableList<Node> {
        return mChildren
    }

    fun addChild(node: Node){
        mChildren.add(node)
    }
}