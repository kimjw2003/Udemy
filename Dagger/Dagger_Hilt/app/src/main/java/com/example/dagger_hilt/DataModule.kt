package com.example.dagger_hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class DataModule {

    @Provides
    fun proviedDataSource() : DataSource{
        return DataSource()
    }
}