package com.example.dagger_hilt_example.module

import com.example.dagger_hilt_example.Data
import com.example.dagger_hilt_example.SubData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class DataModule {

    @Provides
    fun provideData() : Data {
        return Data(provideSubData())
    }

    @Provides
    fun provideSubData() : SubData {
        return SubData()
    }
}