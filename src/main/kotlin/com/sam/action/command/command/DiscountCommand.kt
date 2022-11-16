package com.sam.action.command.command

import com.sam.action.command.Command
import com.sam.action.command.handler.DiscountHandler

class DiscountCommand : Command() {

    private val handler = DiscountHandler()

    override fun execute() = handler.getDiscounts()
}