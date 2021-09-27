package com.compose.noteappclean.core.data.internal

import androidx.room.Database
import androidx.room.RoomDatabase
import com.compose.noteappclean.core.domain.data.room.NoteDao
import com.compose.noteappclean.core.model.Note

@Database(entities = [Note::class],version = 1, exportSchema = true)
abstract class NoteDB : RoomDatabase() {
    abstract val noteDao: NoteDao
}