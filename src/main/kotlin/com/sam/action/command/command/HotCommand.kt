package com.sam.action.command.command

import com.sam.action.command.Command
import com.sam.action.command.handler.HotHandler

class HotCommand : Command() {

    private val handle = HotHandler()

    override fun execute() = handle.getHots()
}