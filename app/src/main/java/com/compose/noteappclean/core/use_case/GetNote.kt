package com.compose.noteappclean.core.use_case

import com.compose.noteappclean.core.domain.repository.NoteRepository
import com.compose.noteappclean.core.model.Note

/**
 * @author Ever Solis on 2/10/21.
 **/
class GetNote(
    private val repository: NoteRepository
){
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}