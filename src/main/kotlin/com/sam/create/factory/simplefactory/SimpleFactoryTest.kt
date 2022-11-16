package com.sam.create.factory.simplefactory


fun main() {
    peterDo()
    jamesDo()
    lisaDo()
}

fun peterDo() {
    //使用单工厂方法+标识
    val fruit = SimpleFactory.getFruit(SimpleFactory.TYPE_BANANA)
    fruit?.draw()
}

fun jamesDo(){
    //使用多工厂方法
    val fruit = SimpleFactory.getFruitApple()
    fruit.draw()
}

fun lisaDo(){
    val fruit = SimpleFactory.getFruit(SimpleFactory.TYPE_ORANGE)
    fruit?.draw()
}