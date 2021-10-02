package com.compose.noteappclean.core.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.compose.noteappclean.presentation.theme.*
import java.lang.Exception

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title : String,
    val content: String,
    val timestamp: Long,
    val color: Int
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
