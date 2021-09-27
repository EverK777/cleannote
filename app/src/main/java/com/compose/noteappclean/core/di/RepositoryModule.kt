package com.compose.noteappclean.core.di

import com.compose.noteappclean.core.data.internal.NoteDB
import com.compose.noteappclean.core.data.repository.NoteRepositoryImpl
import com.compose.noteappclean.core.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @ViewModelScoped
    fun provideNoteRepository(db: NoteDB) : NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

}