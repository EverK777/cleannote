package com.compose.noteappclean.core.data.repository

import com.compose.noteappclean.core.domain.data.room.NoteDao
import com.compose.noteappclean.core.domain.repository.NoteRepository
import com.compose.noteappclean.core.model.Note
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note = note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note = note)
    }
}