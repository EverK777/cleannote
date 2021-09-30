package com.compose.noteappclean.presentation.view.notes

import com.compose.noteappclean.core.helpers.NoteOrder
import com.compose.noteappclean.core.model.Note

sealed class NotesEvent {
    data class Order ( val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
