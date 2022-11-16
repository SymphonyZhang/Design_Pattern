package com.sam.structure.composite

// 叶子节点，用于末端，可用可不用
class LeafNode(name: String) : Node(name) {

    override fun getChildren(): MutableList<Node> {
        return mutableListOf<Node>()
    }
}