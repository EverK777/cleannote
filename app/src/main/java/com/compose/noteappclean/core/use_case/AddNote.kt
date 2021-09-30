package com.compose.noteappclean.core.use_case

import com.compose.noteappclean.core.domain.repository.NoteRepository
import com.compose.noteappclean.core.model.InvalidNoteException
import com.compose.noteappclean.core.model.Note
import javax.inject.Inject

class AddNote @Inject constructor(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note = note)
    }

}