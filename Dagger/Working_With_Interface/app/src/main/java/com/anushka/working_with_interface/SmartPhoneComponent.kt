package com.anushka.working_with_interface

import dagger.Component

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {
   fun getSmartPhone() : SmartPhone
}