package com.sam.action.command

import com.sam.action.command.command.DiscountCommand
import com.sam.action.command.command.HotCommand
import com.sam.action.command.command.NewerCommand

fun main() {
    val command1:Command = HotCommand()
    val command2:Command = NewerCommand()
    val command3:Command = DiscountCommand()

    val listView = ListView(command1)

    listView.getList()
}