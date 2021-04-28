package com.anushka.working_with_interface

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private  val serviceProvider: ServiceProvider) {


    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}
