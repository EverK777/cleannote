package com.compose.noteappclean.presentation.view.add_edit_note

/**
 * @author Ever Solis on 2/10/21.
 **/
data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)