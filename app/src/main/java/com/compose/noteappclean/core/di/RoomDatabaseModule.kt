package com.compose.noteappclean.core.di

import android.app.Application
import androidx.room.Room
import com.compose.noteappclean.core.data.internal.NoteDB
import com.compose.noteappclean.core.domain.data.room.NoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomDatabaseModule {

    @Provides
    @Singleton
    fun providesNoteDatabase(application: Application) : NoteDB{
        return Room.databaseBuilder(
            application,
            NoteDB::class.java,
            "CleanNoteDB")
            .fallbackToDestructiveMigration()
            .build()
    }

}