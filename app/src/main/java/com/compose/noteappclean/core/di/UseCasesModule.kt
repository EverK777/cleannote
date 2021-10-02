package com.compose.noteappclean.core.di

import com.compose.noteappclean.core.domain.repository.NoteRepository
import com.compose.noteappclean.core.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {

    @Provides
    @Singleton
    fun providesNoteUseCases(repository: NoteRepository) : NoteUseCases {
        return NoteUseCases(
            GetNotes(repository),
            DeleteNote((repository)) ,
            AddNote(repository = repository),
            GetNote(repository = repository)
        )
    }
}