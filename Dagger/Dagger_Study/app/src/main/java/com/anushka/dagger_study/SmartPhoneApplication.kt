package com.anushka.dagger_study

import android.app.Application

class SmartPhoneApplication : Application() {

    lateinit var smartPhoneComponent: SmartPhoneComponent

    override fun onCreate() {
        smartPhoneComponent = initDagger()

        super.onCreate()
    }

    private fun initDagger() : SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder()
            .memoryCardModule(MemoryCardModule(100))
            .build()


}