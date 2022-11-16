package com.sam.structure.composite

import com.google.gson.Gson

fun main() {
    sendFruit()
}

fun sendFruit() {
    val root = DistrictNode("根")

    //一线目录
    root.addChild(DistrictNode("上海"))
    root.addChild(DistrictNode("天津"))
    val districtNode = DistrictNode("北京")
    root.addChild(districtNode)

    //二级目录
    districtNode.addChild(DistrictNode("海淀区"))
    districtNode.addChild(DistrictNode("本城区"))
    val districtNode2 = DistrictNode("朝阳区")
    districtNode.addChild(districtNode2)

    //三级目录
    /*districtNode2.addChild(DistrictNode("三里屯"))
    districtNode2.addChild(DistrictNode("朝阳外街"))*/
    districtNode2.addChild(LeafNode("三里屯"))
    districtNode2.addChild(LeafNode("朝阳外街"))

    println(Gson().toJson(root))



}
