package com.sam.structure.adapter

import com.sam.entity.bag.AppleBag
import com.sam.entity.bag.OrangeBag


class OrangeBagAdapter() : OrangeBag() {
    private lateinit var appleBag: AppleBag

    constructor(appleBag: AppleBag) : this() {
        this.appleBag = appleBag
    }

    override fun pack() = appleBag.pack()
}