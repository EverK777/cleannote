package com.compose.noteappclean.core.helpers

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()

}
