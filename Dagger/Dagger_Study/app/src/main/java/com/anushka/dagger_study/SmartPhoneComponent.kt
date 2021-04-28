package com.anushka.dagger_study

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    fun inject(mainActivity: MainActivity)
}