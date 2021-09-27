package com.compose.noteappclean.core.use_case

import com.compose.noteappclean.core.domain.repository.NoteRepository
import com.compose.noteappclean.core.model.Note
import javax.inject.Inject

class DeleteNote @Inject constructor(
    private val repository: NoteRepository
        ) {

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note = note)
    }

}