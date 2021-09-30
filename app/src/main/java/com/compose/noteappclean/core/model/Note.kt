package com.compose.noteappclean.core.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.lang.Exception

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title : String,
    val content: String,
    val timestamp: Long,
    val color: Int
)

class InvalidNoteException(message: String) : Exception(message)
