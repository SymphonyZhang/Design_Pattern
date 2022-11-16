package com.sam.action.command.command

import com.sam.action.command.Command
import com.sam.action.command.handler.NewerHandler

class NewerCommand: Command() {

    private val handler = NewerHandler()

    override fun execute() = handler.getNewers()
}