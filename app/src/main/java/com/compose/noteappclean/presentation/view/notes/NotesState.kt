package com.compose.noteappclean.presentation.view.notes

import com.compose.noteappclean.core.helpers.NoteOrder
import com.compose.noteappclean.core.helpers.OrderType
import com.compose.noteappclean.core.model.Note

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
