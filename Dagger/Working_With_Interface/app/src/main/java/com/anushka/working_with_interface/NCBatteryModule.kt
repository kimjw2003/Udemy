package com.anushka.working_with_interface

import dagger.Binds
import dagger.Module

@Module
abstract class NCBatteryModule {

    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery) : Battery
}